package com.example.workify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

    Thread thread = new Thread(){

        @Override
        public void run() {
            try {
                sleep(1000) ;
                Intent homeintent = new Intent(getApplicationContext(),SignInActivity.class);startActivity(homeintent);finish();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    };

    thread.start();
    }
}
