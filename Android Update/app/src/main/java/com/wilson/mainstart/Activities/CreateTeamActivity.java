package com.wilson.mainstart.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import com.wilson.mainstart.R;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wilson.mainstart.MainActivity2;
import com.wilson.mainstart.R;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wilson.mainstart.MainActivity2;
import com.wilson.mainstart.R;

public class CreateTeamActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    EditText teamName, totalTeamMem;
    TextView registerTeam,popup,popupInvite;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_team);
        bottomNavigationView = findViewById(R.id.createTeam_bottom_nav);
        totalTeamMem = findViewById(R.id.createTeam_TotalTeamMem_ET);
        teamName = findViewById(R.id.createTeam_TeamNAme_ET);
        registerTeam = findViewById(R.id.createTeam_RegisterTeam_TV);
        popup = findViewById(R.id.createTeam_Popup_TV);
        popupInvite = findViewById(R.id.createTeam_PopupInvite_TV2);

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
        registerTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmpty(teamName) || isEmpty(totalTeamMem)){
                    Toast.makeText(CreateTeamActivity.this, "Details Required!! ", Toast.LENGTH_SHORT).show();
                }else {
                    teamName.setVisibility(View.INVISIBLE);
                    totalTeamMem.setVisibility(View.INVISIBLE);
                    registerTeam.setVisibility(View.INVISIBLE);
                    popup.setText("Team Created!!");
                    popupInvite.setText("Team Code: " + createInvite());
                    popup.setVisibility(View.VISIBLE);
                    popupInvite.setVisibility(View.VISIBLE);
                }
            }
        });
    }
    public static StringBuilder createInvite(){
        StringBuilder finalCode = new StringBuilder();
        double s = Math.random();
        double ff = s*1000000;
        finalCode.append((int)ff);
//        double f = s*1;
//        int ff = (int)f;
//        finalCode.append((char)ff);
//        finalCode.append((int)s);
        return finalCode;
    }
    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

}