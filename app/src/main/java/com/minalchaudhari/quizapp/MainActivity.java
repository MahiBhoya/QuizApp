package com.minalchaudhari.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SwitchIntDef")
    public void main_btn(View view) {
        if (view.getId() == R.id.btn_play) {
            startActivity(new Intent(MainActivity.this, playActivity.class));
        } else if (view.getId() == R.id.btn_setting) {
            startActivity(new Intent(MainActivity.this, settingActivity.class));
        } else if (view.getId() == R.id.btn_exit) {
            finishAffinity();
        }
    }
}

