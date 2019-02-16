package com.example.hessah.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getString(R.string.app_name));

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        final TextView musicView = findViewById(R.id.musicLibrary);

         musicView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent musicIntent = new Intent(MainActivity.this, MusicLibraryActivity.class);
                startActivity(musicIntent);
            }
        });

        final TextView favoritesView = findViewById(R.id.Favorites);

        favoritesView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);
            }
        });

    }
}
