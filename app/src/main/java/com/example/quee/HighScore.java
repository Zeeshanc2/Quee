package com.example.quee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class HighScore extends AppCompatActivity implements ValueEventListener {
    DatabaseReference myRef = FirebaseDatabase.getInstance().getReference("HighScores");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);
        Button clear_bt = findViewById(R.id.clear);
        clear_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onClear();
            }
        });
        myRef.addValueEventListener(this);
        Button reload_bt = findViewById(R.id.reload_bt);
        reload_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        ArrayList<HighScoreModel> highScoreList= new ArrayList<>();
        highScoreList.clear();
        for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
            HighScoreModel hsm = dataSnapshot1.getValue(HighScoreModel.class);
            highScoreList.add(hsm);
            ArrayAdapter<HighScoreModel> highScoreAdapter = new HighScoreAdapter(this,highScoreList);
            ListView myList = findViewById(R.id.highscore_list);
            myList.setAdapter(highScoreAdapter);
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {
        Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
    }

    public void onClear(){
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot:dataSnapshot.getChildren()){
                    myRef.removeValue();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
