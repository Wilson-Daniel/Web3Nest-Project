package com.wilson.mainstart.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wilson.mainstart.MainActivity2;
import com.wilson.mainstart.R;

public class MetaForestActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ImageView metaForest_Globe_imageView;
    ImageView meta_fruit,meta_flower,meta_amla,meta_orange,meta_guava,meta_papaya,meta_rose,meta_meriGold,meta_sunflower,meta_lily,meta_jasmin,meta_sarifa;
    Animation metaForest_Globe_Rotation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meta_forest);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        metaForest_Globe_imageView = findViewById(R.id.metaForest_ImageView_planet);
        rotateAnimation();

        meta_fruit = findViewById(R.id.imageView12);
        meta_flower = findViewById(R.id.imageView11);
        meta_amla = findViewById(R.id.meta10dfdX_IV_fruit);
        meta_orange = findViewById(R.id.meta10ddX_IV_fruit4);
        meta_guava = findViewById(R.id.meta10ddX_IV_fruit3);
        meta_papaya = findViewById(R.id.meta10ddX_IV_fruit2);
        meta_rose = findViewById(R.id.meta10ddX_IV_fruit);
        meta_meriGold = findViewById(R.id.meta10ddX_IV_fruit5);
        meta_sunflower = findViewById(R.id.meta10ffddX_IV_fruit2);
        meta_lily = findViewById(R.id.metdfdfa10ddX_IV_fruit);
        meta_jasmin = findViewById(R.id.ghmeta10cfddX_IV_fruit2);
        meta_sarifa = findViewById(R.id.meta10ddX_IV_fruit6);

        meta_flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Flower", Toast.LENGTH_SHORT).show();
            }
        });
        meta_fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Fruit", Toast.LENGTH_SHORT).show();
            }
        });
        meta_flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Flower", Toast.LENGTH_SHORT).show();
            }
        });
        meta_amla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Amla", Toast.LENGTH_SHORT).show();
            }
        });
        meta_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Orange", Toast.LENGTH_SHORT).show();
            }
        });
        meta_guava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Guava", Toast.LENGTH_SHORT).show();
            }
        });
        meta_papaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Papaya", Toast.LENGTH_SHORT).show();
            }
        });
        meta_rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Rose", Toast.LENGTH_SHORT).show();
            }
        });
        meta_meriGold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for MeriGold", Toast.LENGTH_SHORT).show();
            }
        });
        meta_sunflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Sunflower", Toast.LENGTH_SHORT).show();
            }
        });
        meta_lily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Lily", Toast.LENGTH_SHORT).show();
            }
        });
        meta_jasmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Jasmin", Toast.LENGTH_SHORT).show();
            }
        });
        meta_sarifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Played for Sarifa", Toast.LENGTH_SHORT).show();
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
    public void rotateAnimation(){
        metaForest_Globe_Rotation = AnimationUtils.loadAnimation(this,R.anim.rotate_anim);
        metaForest_Globe_Rotation.setRepeatCount(Animation.INFINITE);
        metaForest_Globe_imageView.setAnimation(metaForest_Globe_Rotation);
    }
}