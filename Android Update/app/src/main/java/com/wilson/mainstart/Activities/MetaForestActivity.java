package com.wilson.mainstart.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
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
                dialogPopUp();
            }
        });
        meta_fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPopUp();
            }
        });

        meta_amla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPopUp();
            }
        });
        meta_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPopUp();
            }
        });
        meta_guava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPopUp();
            }
        });
        meta_papaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPopUp();
            }
        });
        meta_rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPopUp();
            }
        });
        meta_meriGold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPopUp();
            }
        });
        meta_sunflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPopUp();
            }
        });
        meta_lily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPopUp();
            }
        });
        meta_jasmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPopUp();
            }
        });
        meta_sarifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPopUp();
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
    public void dialogPopUp(){
        Dialog dialog = new Dialog(MetaForestActivity.this);
        dialog.setContentView(R.layout.metaforest_custom_dialogbox);
        Button closeBT = dialog.findViewById(R.id.metaforest_dialog_close);
        Button confirmBT = dialog.findViewById(R.id.metaforest_dialog_confirm);
        TextView plusTV = dialog.findViewById(R.id.metaforest_dialog_plus);
        TextView minusTV = dialog.findViewById(R.id.metaforest_dialog_minus);
        TextView numberTV = dialog.findViewById(R.id.metaforest_dialog_number);
        closeBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        confirmBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MetaForestActivity.this, "Confirm", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        plusTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(numberTV.getText().toString());
                number++;
                numberTV.setText(String.valueOf(number));
            }
        });
        minusTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(numberTV.getText().toString());
                if(number>0){
                    number--;
                    numberTV.setText(String.valueOf(number));
                }
            }
        });
        dialog.show();
    }

}