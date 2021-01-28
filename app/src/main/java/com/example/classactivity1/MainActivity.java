package com.example.classactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void launchNextActivity(View view){
        // create an intent and you need to specify from and to
        Intent intent = new Intent(this, ActivityClass1.class);

        // date field
        // intent extras --> Celia's choice
        // both can pack data and send to the targeted activity

        // intent extras:
        // key/value pairs in a Bundle

        // want to pass the count number through intent to second activity
        // and display in a second activity
        // ex: 5 was passed.

        // startActivity(intent);
        startActivityForResult(intent, 1); // < 0 reply is no requested
    }
}