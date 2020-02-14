package com.example.quee;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CourseAdapter extends ArrayAdapter <Courses>{
    public CourseAdapter(Activity context, ArrayList<Courses> courseList) {
        super(context, 0,courseList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.mylistitem,parent,false);
        }
        Courses currentCourse = getItem(position);
        TextView myTextView = listItemView.findViewById(R.id.java_bt);
        myTextView.setText(currentCourse.getCourseName());
        ImageView myImage = listItemView.findViewById(R.id.myImage);
        myImage.setImageResource(currentCourse.getCourseImage());

        return listItemView;
    }
}
