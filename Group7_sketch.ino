#include <Arduino.h>
#if defined(ESP32)
  #include <WiFi.h>
#elif defined(ESP8266)
  #include <ESP8266WiFi.h>
#endif
#include <Firebase_ESP_Client.h>


//Provide the token generation process info.
#include "addons/TokenHelper.h"
//Provide the RTDB payload printing info and other helper functions.
#include "addons/RTDBHelper.h"

// Insert your network credentials
#define WIFI_SSID "Anya@unifi"
#define WIFI_PASSWORD "logintoconnect03A"

// Insert Firebase project API Key
#define API_KEY "AIzaSyBkWxBe4laarBRgWdA0gfOBbqGm-uJqd5c"

// Insert RTDB URLefine the RTDB URL */
#define DATABASE_URL "https://smart-home-54e10-default-rtdb.asia-southeast1.firebasedatabase.app/" 

#define LED1 2
#define FAN_PIN 23 // pin P23 connect to the fan
#define FAN_ON HIGH //logical fan on
#define FAN_OFF LOW // logical fan off
#define Gas_digital 22 // GPI01 to D0
#define Gas_analog 32

#define Threshold 400 // smoke threshold 400

// Define FirebaseUpdateInterval in ms. 
#define FirebaseUpdateInterval 500 

//Define Firebase Data object
FirebaseData fbdo;

FirebaseAuth auth;
FirebaseConfig config;

unsigned long sendDataPrevMillis = 0;
int count = 0;
int valueLED1 = 0;
int valueLED2 = 0;
int valueLED3 = 0;
int valueFAN = 0;
bool signupOK = false;

void setup(){
  Serial.begin(115200);

  
  pinMode(LED1, OUTPUT);
  digitalWrite(LED1,LOW);

  pinMode(FAN_PIN, OUTPUT);
  digitalWrite(FAN_PIN, FAN_OFF);

   pinMode(Gas_digital, INPUT);
   pinMode(Gas_analog,INPUT);
 
  
  WiFi.begin(WIFI_SSID, WIFI_PASSWORD);
  Serial.println("Connecting to Wi-Fi");
  while (WiFi.status() != WL_CONNECTED){
    Serial.print(".");
    delay(1000);


  }
  Serial.println("Connected with IP: ");
  Serial.println(WiFi.localIP());
  Serial.println();

  /* Assign the api key (required) */
  config.api_key = API_KEY;

  /* Assign the RTDB URL (required) */
  config.database_url = DATABASE_URL;

  /* Sign up */
  if (Firebase.signUp(&config, &auth, "", "")){
    Serial.println("ok");
    signupOK = true;
  }
  else{
    Serial.printf("%s\n", config.signer.signupError.message.c_str());
  }

  // Assign the callback function for the 
  //long running token generation task
  config.token_status_callback = tokenStatusCallback;
  
  Firebase.begin(&config, &auth);
  Firebase.reconnectWiFi(true);
}

void loop(){

  if (Firebase.ready() && signupOK && (millis() - sendDataPrevMillis > FirebaseUpdateInterval || sendDataPrevMillis == 0)){
    sendDataPrevMillis = millis();

    int gassensorAnalog = analogRead(Gas_analog);
    int gassensorDigital = digitalRead(Gas_digital);



     // Write an Digital Int number to database path /Smoke Sensor
    if (Firebase.RTDB.setInt(&fbdo, "Smoke Sensor/Digital Sensor", gassensorDigital)){
      Serial.println("Digital Gas = ");
      Serial.println(gassensorDigital);
      Serial.print("\t");
      Serial.print("\t");



    }
    else {
      Serial.println("CONNECTION FAILED");
      Serial.println("REASON: " + fbdo.errorReason());
    }

    //Smoke sensor analog
    if (Firebase.RTDB.setInt(&fbdo, "Smoke Sensor/Analog Sensor", gassensorAnalog)){
      Serial.println("Analog:");
      Serial.println(gassensorAnalog);
      // digitalWrite (Buzzer, HIGH) ; //send tone
      
      //digitalWrite (Buzzer, LOW) ;  //no tone
  }
  
    else {
      Serial.println("CONNECTION FAILED");
      Serial.println("REASON: " + fbdo.errorReason());
    }



/*

  
  // Read the LED1 status from database path /LED1
    if (Firebase.RTDB.getInt(&fbdo, "/LED1")) {
      //if (fbdo.dataType() == "int") {
        valueLED1 = fbdo.intData();
        Serial.println("LED1 value = ");
        Serial.println(valueLED1);
      //}
    }
    else {
      Serial.println(fbdo.errorReason());
    }
    
    if(valueLED1==1) {
      digitalWrite(LED1,HIGH);
    }
    else if(valueLED1==0) {
      digitalWrite(LED1,LOW);
    }
    else{
      digitalWrite(LED1,LOW);
      delay(300);
      digitalWrite(LED1,HIGH);
      delay(300);
    }

  // Read the fan status from the database path /Fan
    if (Firebase.RTDB.getInt(&fbdo, "/FAN")) {
      valueFAN = fbdo.intData();
      Serial.print("Fan value = ");
      Serial.println(valueFAN);
      
      // Control the fan based on the value
      if (valueFAN == 1) {
        digitalWrite(FAN_PIN, FAN_ON);
      }
      else {
        digitalWrite(FAN_PIN, FAN_OFF);
      }
    }
    else {
      Serial.println(fbdo.errorReason());
    }
  
  //Write an Int number to database path /Integer
    if (Firebase.RTDB.setInt(&fbdo, "/Integer", count)){
      Serial.println("Integer value = ");
      Serial.println(count);
    }
    else {
      Serial.println("CONNECTION FAILED");
      Serial.println("REASON: " + fbdo.errorReason());
    }
  count++;
  */
  delay(100);
}
}
