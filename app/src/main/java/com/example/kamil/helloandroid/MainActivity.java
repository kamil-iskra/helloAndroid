package com.example.kamil.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String LOGACTIVITY = "ANDROID ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOGACTIVITY, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOGACTIVITY, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOGACTIVITY, "onPause");
    }

    
}