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

public class Meta10XActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    TextView meta10X_Amla;
    TextView meta10X_Guava;
    TextView meta10X_Orange;
    TextView meta10X_Papaya;
    TextView meta10X_Sharifa;
    TextView meta10X_Sunflower;
    TextView meta10X_Marigold;
    TextView meta10X_Rose;
    TextView meta10X_Lily;
    TextView meta10X_Jasmin;
    TextView meta10X_timer;
    TextView meta10X_invisibleText;
    TextView meta10X_Alert;

    private CountDownTimer countDownTimer;
    private long timeLeftInMillis = 10000;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meta10x_activity);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        meta10X_Amla = findViewById(R.id.meta10X_IV_fruit);
        meta10X_Guava = findViewById(R.id.meta10X_IV_fruit_Guava);
        meta10X_Orange = findViewById(R.id.meta10X_IV_fruit2_Orange);
        meta10X_Papaya = findViewById(R.id.meta10X_IV_fruit9_Papaya);
        meta10X_Sharifa = findViewById(R.id.meta10X_IV_fruit3_Sharifa);
        meta10X_Sunflower = findViewById(R.id.meta10X_IV_fruit_Sunflower);
        meta10X_Marigold = findViewById(R.id.meta10X_IV_fruit_MArigold);
        meta10X_Rose = findViewById(R.id.meta10X_IV_fruit_Rose);
        meta10X_Lily = findViewById(R.id.meta10X_IV_fruit_Lily);
        meta10X_Jasmin = findViewById(R.id.meta10X_IV_fruit_Jasmin);
        meta10X_timer = findViewById(R.id.tenXtimmm);
        meta10X_Alert = findViewById(R.id.meta10_textView13);
        meta10X_invisibleText = findViewById(R.id.InvisibleText_meta10x);

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
        startCountDown();
        meta10X_Amla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta10X_Amla.setVisibility(View.INVISIBLE);
                meta10X_Guava.setVisibility(View.INVISIBLE);
                meta10X_Orange.setVisibility(View.INVISIBLE);
                meta10X_Papaya.setVisibility(View.INVISIBLE);
                meta10X_Sharifa.setVisibility(View.INVISIBLE);
                meta10X_Sunflower.setVisibility(View.INVISIBLE);
                meta10X_Marigold.setVisibility(View.INVISIBLE);
                meta10X_Rose.setVisibility(View.INVISIBLE);
                meta10X_Lily.setVisibility(View.INVISIBLE);
                meta10X_Jasmin.setVisibility(View.INVISIBLE);
                meta10X_invisibleText.setText("Waiting for other players to choose");
                meta10X_invisibleText.setVisibility(View.VISIBLE);
            }
        });
        meta10X_Orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta10X_Amla.setVisibility(View.INVISIBLE);
                meta10X_Guava.setVisibility(View.INVISIBLE);
                meta10X_Orange.setVisibility(View.INVISIBLE);
                meta10X_Papaya.setVisibility(View.INVISIBLE);
                meta10X_Sharifa.setVisibility(View.INVISIBLE);
                meta10X_Sunflower.setVisibility(View.INVISIBLE);
                meta10X_Marigold.setVisibility(View.INVISIBLE);
                meta10X_Rose.setVisibility(View.INVISIBLE);
                meta10X_Lily.setVisibility(View.INVISIBLE);
                meta10X_Jasmin.setVisibility(View.INVISIBLE);
                meta10X_invisibleText.setText("Waiting for other players to choose");
                meta10X_invisibleText.setVisibility(View.VISIBLE);
            }
        });
        meta10X_Guava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta10X_Amla.setVisibility(View.INVISIBLE);
                meta10X_Guava.setVisibility(View.INVISIBLE);
                meta10X_Orange.setVisibility(View.INVISIBLE);
                meta10X_Papaya.setVisibility(View.INVISIBLE);
                meta10X_Sharifa.setVisibility(View.INVISIBLE);
                meta10X_Sunflower.setVisibility(View.INVISIBLE);
                meta10X_Marigold.setVisibility(View.INVISIBLE);
                meta10X_Rose.setVisibility(View.INVISIBLE);
                meta10X_Lily.setVisibility(View.INVISIBLE);
                meta10X_Jasmin.setVisibility(View.INVISIBLE);
                meta10X_invisibleText.setText("Waiting for other players to choose");
                meta10X_invisibleText.setVisibility(View.VISIBLE);
            }
        });
        meta10X_Papaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta10X_Amla.setVisibility(View.INVISIBLE);
                meta10X_Guava.setVisibility(View.INVISIBLE);
                meta10X_Orange.setVisibility(View.INVISIBLE);
                meta10X_Papaya.setVisibility(View.INVISIBLE);
                meta10X_Sharifa.setVisibility(View.INVISIBLE);
                meta10X_Sunflower.setVisibility(View.INVISIBLE);
                meta10X_Marigold.setVisibility(View.INVISIBLE);
                meta10X_Rose.setVisibility(View.INVISIBLE);
                meta10X_Lily.setVisibility(View.INVISIBLE);
                meta10X_Jasmin.setVisibility(View.INVISIBLE);
                meta10X_invisibleText.setText("Waiting for other players to choose");
                meta10X_invisibleText.setVisibility(View.VISIBLE);
            }
        });
        meta10X_Sharifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta10X_Amla.setVisibility(View.INVISIBLE);
                meta10X_Guava.setVisibility(View.INVISIBLE);
                meta10X_Orange.setVisibility(View.INVISIBLE);
                meta10X_Papaya.setVisibility(View.INVISIBLE);
                meta10X_Sharifa.setVisibility(View.INVISIBLE);
                meta10X_Sunflower.setVisibility(View.INVISIBLE);
                meta10X_Marigold.setVisibility(View.INVISIBLE);
                meta10X_Rose.setVisibility(View.INVISIBLE);
                meta10X_Lily.setVisibility(View.INVISIBLE);
                meta10X_Jasmin.setVisibility(View.INVISIBLE);
                meta10X_invisibleText.setText("Waiting for other players to choose");
                meta10X_invisibleText.setVisibility(View.VISIBLE);
            }
        });
        meta10X_Sunflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta10X_Amla.setVisibility(View.INVISIBLE);
                meta10X_Guava.setVisibility(View.INVISIBLE);
                meta10X_Orange.setVisibility(View.INVISIBLE);
                meta10X_Papaya.setVisibility(View.INVISIBLE);
                meta10X_Sharifa.setVisibility(View.INVISIBLE);
                meta10X_Sunflower.setVisibility(View.INVISIBLE);
                meta10X_Marigold.setVisibility(View.INVISIBLE);
                meta10X_Rose.setVisibility(View.INVISIBLE);
                meta10X_Lily.setVisibility(View.INVISIBLE);
                meta10X_Jasmin.setVisibility(View.INVISIBLE);
                meta10X_invisibleText.setText("Waiting for other players to choose");
                meta10X_invisibleText.setVisibility(View.VISIBLE);
            }
        });
        meta10X_Marigold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta10X_Amla.setVisibility(View.INVISIBLE);
                meta10X_Guava.setVisibility(View.INVISIBLE);
                meta10X_Orange.setVisibility(View.INVISIBLE);
                meta10X_Papaya.setVisibility(View.INVISIBLE);
                meta10X_Sharifa.setVisibility(View.INVISIBLE);
                meta10X_Sunflower.setVisibility(View.INVISIBLE);
                meta10X_Marigold.setVisibility(View.INVISIBLE);
                meta10X_Rose.setVisibility(View.INVISIBLE);
                meta10X_Lily.setVisibility(View.INVISIBLE);
                meta10X_Jasmin.setVisibility(View.INVISIBLE);
                meta10X_invisibleText.setText("Waiting for other players to choose");
                meta10X_invisibleText.setVisibility(View.VISIBLE);
            }
        });
        meta10X_Rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta10X_Amla.setVisibility(View.INVISIBLE);
                meta10X_Guava.setVisibility(View.INVISIBLE);
                meta10X_Orange.setVisibility(View.INVISIBLE);
                meta10X_Papaya.setVisibility(View.INVISIBLE);
                meta10X_Sharifa.setVisibility(View.INVISIBLE);
                meta10X_Sunflower.setVisibility(View.INVISIBLE);
                meta10X_Marigold.setVisibility(View.INVISIBLE);
                meta10X_Rose.setVisibility(View.INVISIBLE);
                meta10X_Lily.setVisibility(View.INVISIBLE);
                meta10X_Jasmin.setVisibility(View.INVISIBLE);
                meta10X_invisibleText.setText("Waiting for other players to choose");
                meta10X_invisibleText.setVisibility(View.VISIBLE);
            }
        });
        meta10X_Lily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta10X_Amla.setVisibility(View.INVISIBLE);
                meta10X_Guava.setVisibility(View.INVISIBLE);
                meta10X_Orange.setVisibility(View.INVISIBLE);
                meta10X_Papaya.setVisibility(View.INVISIBLE);
                meta10X_Sharifa.setVisibility(View.INVISIBLE);
                meta10X_Sunflower.setVisibility(View.INVISIBLE);
                meta10X_Marigold.setVisibility(View.INVISIBLE);
                meta10X_Rose.setVisibility(View.INVISIBLE);
                meta10X_Lily.setVisibility(View.INVISIBLE);
                meta10X_Jasmin.setVisibility(View.INVISIBLE);
                meta10X_invisibleText.setText("Waiting for other players to choose!!");
                meta10X_invisibleText.setVisibility(View.VISIBLE);
            }
        });
        meta10X_Jasmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meta10X_Amla.setVisibility(View.INVISIBLE);
                meta10X_Guava.setVisibility(View.INVISIBLE);
                meta10X_Orange.setVisibility(View.INVISIBLE);
                meta10X_Papaya.setVisibility(View.INVISIBLE);
                meta10X_Sharifa.setVisibility(View.INVISIBLE);
                meta10X_Sunflower.setVisibility(View.INVISIBLE);
                meta10X_Marigold.setVisibility(View.INVISIBLE);
                meta10X_Rose.setVisibility(View.INVISIBLE);
                meta10X_Lily.setVisibility(View.INVISIBLE);
                meta10X_Jasmin.setVisibility(View.INVISIBLE);
                meta10X_invisibleText.setText("Waiting for other players to choose");
                meta10X_invisibleText.setVisibility(View.VISIBLE);
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
                meta10X_timer.setText("Countdown Finished");
                meta10X_Alert.setVisibility(View.INVISIBLE);

                if(meta10X_Amla.getVisibility()== View.VISIBLE){
                    meta10X_Amla.setVisibility(View.INVISIBLE);
                    meta10X_Guava.setVisibility(View.INVISIBLE);
                    meta10X_Orange.setVisibility(View.INVISIBLE);
                    meta10X_Papaya.setVisibility(View.INVISIBLE);
                    meta10X_Sharifa.setVisibility(View.INVISIBLE);
                    meta10X_Sunflower.setVisibility(View.INVISIBLE);
                    meta10X_Marigold.setVisibility(View.INVISIBLE);
                    meta10X_Rose.setVisibility(View.INVISIBLE);
                    meta10X_Lily.setVisibility(View.INVISIBLE);
                    meta10X_Jasmin.setVisibility(View.INVISIBLE);
                    meta10X_invisibleText.setText("Didn't made any choice!! You have Loss 10X");
                    meta10X_invisibleText.setVisibility(View.VISIBLE);
                }else {
                    double ra = Math.random() * 10;
                    int value1 = (int) Math.round(ra);
                    if (value1 % 2 == 0) {
                        meta10X_invisibleText.setText("You have Loss 10X");
                    } else {
                        meta10X_invisibleText.setText("You have Won 10X");
                    }
                }
            }
        }.start();
    }

    private void updateCountdownText() {
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeFormatted = String.format("%02d:%02d", minutes, seconds);
        meta10X_timer.setText(timeFormatted);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}