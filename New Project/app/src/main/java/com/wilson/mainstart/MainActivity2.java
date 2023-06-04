package com.wilson.mainstart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.wilson.mainstart.FRAGMENTS.HomeFragment;
import com.wilson.mainstart.FRAGMENTS.MetaForestFragment;
import com.wilson.mainstart.FRAGMENTS.ProfileFragment;
import com.wilson.mainstart.FRAGMENTS.ReelFragment;

public class MainActivity2 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    MetaForestFragment metaForestFragment = new MetaForestFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    ReelFragment reelFragment = new ReelFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,homeFragment).commit();
                        return true;
                    case R.id.Reels:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,reelFragment).commit();
                        return true;
                    case R.id.Metaforest:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,metaForestFragment).commit();
                        return true;
                    case R.id.Profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,profileFragment).commit();
                        return true;

                }
                return false;
            }
        });
    }
}