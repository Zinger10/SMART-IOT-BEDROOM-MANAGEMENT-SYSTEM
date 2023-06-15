package com.example.minip_homedummy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
public class NextPage extends AppCompatActivity {

    private TextView textView_smokeInt, textView_tempInt, textView_HumidityInt;
    private Button button_onF1,button_offF1,button_onl1,button_offl1;

    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        button_onF1 = (Button) findViewById(R.id.button_onF1);
        button_offF1 = (Button) findViewById(R.id.button_OffF1);

        button_onl1 = (Button) findViewById(R.id.button_onl1);
        button_offl1 = (Button) findViewById(R.id.button_offl1);

        textView_smokeInt = (TextView) findViewById(R.id.textView_smokeInt);
        textView_tempInt = (TextView) findViewById(R.id.textView_tempInt);
        textView_HumidityInt = (TextView) findViewById(R.id.textView_HumidityInt);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        // receive data from database
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String smoke_analogInt = dataSnapshot.child("Smoke Sensor/Analog Sensor").getValue().toString();
                textView_smokeInt.setText(smoke_analogInt);

                String tempInt = dataSnapshot.child("Temperature").getValue().toString();
                textView_tempInt.setText(tempInt);

                String Humidity_Int = dataSnapshot.child("Humidity").getValue().toString();
                textView_HumidityInt.setText(Humidity_Int);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // ----------------------- FAN ON/OFF --------------------------------------------------
        button_onF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("FAN").setValue(1);
            }
        });
        button_offF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("FAN").setValue(0);
            }
        });

        // ---------------------------LED 1 --------------------------------------------------
        button_onl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("LED1").setValue(1);
            }
        });
        button_offl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("LED1").setValue(0);
            }
        });
    }
}