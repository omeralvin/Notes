package com.alvin.pengganuts_10120078;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
//10120078 - Alvin Izza Rohman - IF2
public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    private BottomNavigationView bnv;
    private profil profil = new profil();
    private notes notes = new notes();
    private info info = new info();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnv = findViewById(R.id.bottomNavigationView);
        bnv.setOnItemSelectedListener(this);
        bnv.setSelectedItemId(R.id.profile);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, profil).commit();
                return true;
            case R.id.notes:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, notes).commit();
                return true;
            case R.id.info:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, info).commit();
                return true;
        }
        return false;

    }
}