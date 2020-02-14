package com.example.quee;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button check_highScore = findViewById(R.id.checkHighScore_bt);

        check_highScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HighScore.class);
                startActivity(intent);
            }
        });

        ArrayList<Courses> courseList = new ArrayList<>();
        courseList.add(new Courses("Java",R.drawable.java));
        courseList.add(new Courses("Android",R.drawable.androidlogo));
        courseList.add(new Courses("Data Structures",R.drawable.dataslogo));
        courseList.add(new Courses("Sql Database",R.drawable.sqllogo));
        courseList.add(new Courses("C Sharp",R.drawable.csharplogo));

        ArrayAdapter courseAdapter = new CourseAdapter(this,courseList);
        ListView myCourseList = findViewById(R.id.list);

        myCourseList.setAdapter(courseAdapter);

        myCourseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    intent = new Intent(MainActivity.this,QuestionActivity.class);
                    intent.putExtra("title","Java");
                    intent.putExtra("mName",getIntent().getStringExtra("name"));
                    startActivity(intent);
                }
                if(position == 1){
                    intent = new Intent(MainActivity.this,QuestionActivity.class);
                    intent.putExtra("mName",getIntent().getStringExtra("name"));
                    intent.putExtra("title","Android");
                    startActivity(intent);
                }
                if(position == 2){
                    intent = new Intent(MainActivity.this,QuestionActivity.class);
                    intent.putExtra("mName",getIntent().getStringExtra("name"));
                    intent.putExtra("title","Data Structures");
                    startActivity(intent);
                }
                if(position == 3){
                    intent = new Intent(MainActivity.this,QuestionActivity.class);
                    intent.putExtra("mName",getIntent().getStringExtra("name"));
                    intent.putExtra("title","Sql Database");
                    startActivity(intent);
                }
                if(position == 4){
                    intent = new Intent(MainActivity.this,QuestionActivity.class);
                    intent.putExtra("mName",getIntent().getStringExtra("name"));
                    intent.putExtra("title","C Sharp");
                    startActivity(intent);
                }
            }
        });
    }
}
