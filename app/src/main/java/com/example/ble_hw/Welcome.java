package com.example.ble_hw;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void click(View v) {
        Intent intent = new Intent();
        intent.setClass(Welcome.this, MainActivity.class);
        startActivity(intent);
    }


    // Disable back button
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

}

