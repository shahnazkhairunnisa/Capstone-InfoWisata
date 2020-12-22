package com.capstone.infowisata.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.capstone.infowisata.R;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Thread timeThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(com.capstone.infowisata.activities.WelcomeActivity.this, IntroActivity.class);
                    startActivity(intent);
                }
            }
        };
        timeThread.start();
    }
}