package com.example.mymobaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class CalendarandTimeActivity extends AppCompatActivity {
    View mcalendar;
    View mtime;
    Button mbook;
    Button mlogout;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendarand_time);

        mcalendar=findViewById(R.id.calendarViewBook);
        mtime=findViewById(R.id.edtTime);
        mbook=findViewById(R.id.btnBookNow);
        mlogout=findViewById(R.id.btnExit);

        mbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CalendarandTimeActivity.this,"Date and Time Booked Successfully",Toast.LENGTH_SHORT);

            }
        });
        mlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();

            }
        });

    }
}