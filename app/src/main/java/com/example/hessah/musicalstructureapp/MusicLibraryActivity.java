package com.example.hessah.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);


        Toolbar mlToolbar = (Toolbar) findViewById(R.id.toolbar);
        mlToolbar.setTitle(getString(R.string.music_library));
        mlToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);


        mlToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ArrayList<Song> songs = new ArrayList<Song>();
        for(int i=1 ; i<=20; i++)
            songs.add(new Song("Song " + i,", Artist " + i ));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}
