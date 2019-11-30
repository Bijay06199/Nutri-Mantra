package com.example.nutrimantra;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    private static  int screen= 2000;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.splash_layout);


        Thread myThread = new Thread(){
            @Override
            public void run(){

                try {
                    sleep(2000);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();

                }catch (InterruptedException e){

                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }


    @Override
    protected void onPause() {
        super.onPause();


        finish();
    }


}



