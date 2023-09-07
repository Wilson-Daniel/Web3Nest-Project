package com.wilson.mainstart.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wilson.mainstart.MainActivity2;
import com.wilson.mainstart.R;

public class Meta2XActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    TextView textView_Timer;
    TextView meta2x_IV_fruit;
    TextView meta2x_IV_flower;
    TextView invisibleText;
    TextView notification_TV_meta2x;

    private CountDownTimer countDownTimer;
    private long timeLeftInMillis = 10000;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meta2_xactivity);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        textView_Timer = findViewById(R.id.timmm);
        meta2x_IV_flower = findViewById(R.id.meta2X_IV_flower);
        meta2x_IV_fruit = findViewById(R.id.meta2X_IV_fruit);
        invisibleText = findViewById(R.id.InvisibleText_meta2x);
        notification_TV_meta2x = findViewById(R.id.meta10_textView13);

        startCountDown();

        meta2x_IV_fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta2x_IV_fruit.setVisibility(View.INVISIBLE);
                meta2x_IV_flower.setVisibility(View.INVISIBLE);
                invisibleText.setText("Waiting for other players to choose!!");
                invisibleText.setVisibility(View.VISIBLE);
            }
        });
        meta2x_IV_flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta2x_IV_fruit.setVisibility(View.INVISIBLE);
                meta2x_IV_flower.setVisibility(View.INVISIBLE);
                invisibleText.setText("Waiting for other players!!");
                invisibleText.setVisibility(View.VISIBLE);
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.Metaforest);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity2.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Reels:
                        startActivity(new Intent(getApplicationContext(), ReelActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Metaforest:
                        startActivity(new Intent(getApplicationContext(), MetaForestActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Profile:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }
    private void startCountDown() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountdownText();
            }

            @Override
            public void onFinish() {
                // Perform any actions when the countdown finishes
                textView_Timer.setText("Countdown Finished");
                notification_TV_meta2x.setVisibility(View.INVISIBLE);

                if(meta2x_IV_fruit.getVisibility()== View.VISIBLE){
                    meta2x_IV_fruit.setVisibility(View.INVISIBLE);
                    meta2x_IV_flower.setVisibility(View.INVISIBLE);
                    invisibleText.setText("Didn't made any choice!! You have Loss 2X");
                    invisibleText.setVisibility(View.VISIBLE);
                }else {
                    double ra = Math.random() * 10;
                    int value1 = (int) Math.round(ra);
                    if (value1 % 2 == 0) {
                        invisibleText.setText("You have Loss 2X");
                    } else {
                        invisibleText.setText("You have Won 2X");
                    }
                }
            }
        }.start();
    }

    private void updateCountdownText() {
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeFormatted = String.format("%02d:%02d", minutes, seconds);
        textView_Timer.setText(timeFormatted);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}