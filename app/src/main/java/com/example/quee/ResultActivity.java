package com.example.quee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ResultActivity extends AppCompatActivity {
    String sendScore = "";
    Button highscore_bt;
    DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView myText = findViewById(R.id.score_tv);
        highscore_bt = findViewById(R.id.highscore_bt);
        final String myScore = String.valueOf(getIntent().getIntExtra("score",0));
        sendScore = myScore;
        myText.setText(myScore);
        Button share = findViewById(R.id.share_bt);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this,UserActivity.class);
                intent.putExtra("mscore",sendScore);
                intent.putExtra("mtitle",getIntent().getStringExtra("ntitle"));
                startActivity(intent);
            }
        });
        Button startAgain = findViewById(R.id.again_tv);
        startAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        onHighScore();
    }

    public void onHighScore(){
        highscore_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getIntent().getStringExtra("ntitle");
                final String myScore = String.valueOf(getIntent().getIntExtra("score",0));
                sendScore =myScore;
                String name = getIntent().getStringExtra("nName");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String currentDateandTime = sdf.format(new Date());
                myRef = FirebaseDatabase.getInstance().getReference("HighScores");
                String id = myRef.push().getKey();
                    HighScoreModel highScoreModel = new HighScoreModel(title,sendScore,currentDateandTime,name);
                    myRef.child(id).setValue(highScoreModel);
                    Intent intent = new Intent(ResultActivity.this,HighScore.class);
                    startActivity(intent);
            }
        });
    }
}
