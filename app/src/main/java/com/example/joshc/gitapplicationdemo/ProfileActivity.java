package com.example.joshc.gitapplicationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    void test() {
        Log.d("ODSAJO", "cool");
        Log.d("hi", "cool");
        Log.d("hi", "eh");
        Log.d("alex","v2");
        Log.d("joshchough", "v3");
    }
}
