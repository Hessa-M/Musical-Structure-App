package com.example.hessah.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> androidSongs) {
        super(context, 0, androidSongs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);

        songTextView.setText(currentSong.getSongName());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name);

        artistTextView.setText(currentSong.getArtistName());

        return listItemView;
    }
}
