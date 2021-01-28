package com.example.classactivity1;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static androidx.core.content.ContextCompat.getSystemService;

public class ActivityClass1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class1);

        // display a message
        // x was passed from main activity.


        // extract intent extras info
        Intent intent = getIntent();

        // Log.d("Data from Main Activity", receivedMessage);

    }

}
