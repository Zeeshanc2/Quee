package com.example.quee;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.ArrayList;

public class HighScoreAdapter extends ArrayAdapter<HighScoreModel> {

    public HighScoreAdapter(Activity context, ArrayList<HighScoreModel> highScoreModelList) {
        super(context, 0,highScoreModelList);
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.highscorelistitems,parent,false);
        }
        HighScoreModel currentHighScore = getItem(position);
        TextView name_tv = listItemView.findViewById(R.id.name_tv);
        name_tv.setText(currentHighScore.getName());
        TextView myTextView = listItemView.findViewById(R.id.category_tv);
        myTextView.setText(currentHighScore.getCatName());
        TextView myTextView1 = listItemView.findViewById(R.id.score_tv);
        myTextView1.setText(currentHighScore.getHighScore());
        TextView myTextView2 = listItemView.findViewById(R.id.time_tv);
        myTextView2.setText(currentHighScore.getTime());

        return listItemView;
    }
}
