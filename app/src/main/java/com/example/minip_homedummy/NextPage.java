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

    private TextView textView_fanInt,textView_LED1Value,textView_LED2Value,textView_LED3Value, textView_smokeInt;
    private Button button_onF1,button_offF1,button_onl1,button_offl1,button_onl2,button_offl2,button_onl3,button_offl3;

    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        textView_fanInt = (TextView) findViewById(R.id.textView_fanInt);
        button_onF1 = (Button) findViewById(R.id.button_onF1);
        button_offF1 = (Button) findViewById(R.id.button_OffF1);
        textView_LED1Value = (TextView) findViewById(R.id.textView_LED1Value);
        button_onl1 = (Button) findViewById(R.id.button_onl1);
        button_offl1 = (Button) findViewById(R.id.button_offl1);
        textView_LED2Value = (TextView) findViewById(R.id.textView_LED2Value);
        button_onl2 = (Button) findViewById(R.id.button_onl2);
        button_offl2 = (Button) findViewById(R.id.button_offl2);
        textView_LED3Value = (TextView) findViewById(R.id.textView_LED3Value);
        button_onl3 = (Button) findViewById(R.id.button_onl3);
        button_offl3= (Button) findViewById(R.id.button_offl3);
        textView_smokeInt = (TextView) findViewById(R.id.textView_smokeInt);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        // receive data from database
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String fanInt = dataSnapshot.child("FAN").getValue().toString();
                textView_fanInt.setText(fanInt);

                String LED1Value = dataSnapshot.child("LED1").getValue().toString();
                textView_LED1Value.setText(LED1Value);

                String LED2Value = dataSnapshot.child("LED2").getValue().toString();
                textView_LED2Value.setText(LED2Value);

                String LED3Value = dataSnapshot.child("LED3").getValue().toString();
                textView_LED3Value.setText(LED3Value);

                String smoke_analogInt = dataSnapshot.child("Smoke Sensor/Analog Sensor").getValue().toString();
                textView_smokeInt.setText(smoke_analogInt);
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

        // ---------------------------LED 2 --------------------------------------------------
        button_onl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("LED2").setValue(1);
            }
        });
        button_offl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("LED2").setValue(0);
            }
        });

        // ---------------------------LED 3 --------------------------------------------------
        button_onl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("LED3").setValue(1);
            }
        });
        button_offl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("LED3").setValue(0);
            }
        });
    }
}