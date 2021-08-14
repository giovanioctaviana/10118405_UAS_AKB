package com.giovani.uas_10118405;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity{

    //10118405 Giovani Octaviana 14 agustus 2021 13.33
    
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        Thread thread = new Thread() {
            public void  run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}