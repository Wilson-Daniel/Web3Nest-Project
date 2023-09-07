package com.wilson.mainstart.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.wilson.mainstart.R;

public class CardActivity extends AppCompatActivity {
    private ImageView bacBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        bacBtn = findViewById(R.id.imageView2);
        bacBtn.setOnClickListener(v -> {
            finish();
        });
    }
}