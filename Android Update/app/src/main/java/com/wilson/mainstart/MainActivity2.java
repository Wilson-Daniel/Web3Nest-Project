package com.wilson.mainstart;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wilson.mainstart.Activities.CreateTeamActivity;
import com.wilson.mainstart.Activities.MetaForestActivity;
import com.wilson.mainstart.Activities.ProfileActivity;
import com.wilson.mainstart.Activities.ReelActivity;


public class MainActivity2 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    TextView main_createTeam;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        main_createTeam = findViewById(R.id.main_67textView19);

        bottomNavigationView.setSelectedItemId(R.id.home);
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
        main_createTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CreateTeamActivity.class));
            }
        });

    }
}