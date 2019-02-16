package com.example.hessah.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        Toolbar fToolbar = (Toolbar) findViewById(R.id.toolbar);
        fToolbar.setTitle(getString(R.string.favorites));
        fToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);


        fToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ArrayList<Song> songs = new ArrayList<Song>();
            songs.add(new Song("Song 12",", Artist 12" ));
            songs.add(new Song("Song 1",", Artist 1" ));
            songs.add(new Song("Song 9",", Artist 9" ));
            songs.add(new Song("Song 20",", Artist 20" ));
            songs.add(new Song("Song 3",", Artist 3" ));
            songs.add(new Song("Song 6",", Artist 6" ));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
