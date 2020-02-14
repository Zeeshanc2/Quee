package com.example.quee;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {
    Button getStarted_bt;
    private String name;
    TextView help_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        getStarted_bt = findViewById(R.id.getstarted_bt);
        help_tv = findViewById(R.id.help_tv);
        final Button register = findViewById(R.id.register_bt);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegister();
            }
        });
        onGetStarted();
        onHelp();
    }
    public void onGetStarted(){
        getStarted_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,MainActivity.class);
                intent.putExtra("name",getName());
                startActivity(intent);
                finish();
            }
        });
    }

    public void onHelp(){
        help_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = "How to play?";
                String message = "1.\tTap on Get Started." +
                                 "\n2.\tSelect the category of quiz." +
                                 "\n3.\tThere will be 10 questions for each category." +
                                 "\n4.\tView your score after completing all questions." +
                                 "\n5.\tShare your score with friends via email." +
                                 "\n6.\tView your personal best through High Scores option.";
                showMessage(title,message);
            }
        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showMessage(String Title, String Message){
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setCancelable(true);
        adb.setTitle(Title);
        adb.setMessage(Message);
        adb.show();
    }

    public void onRegister(){
        final EditText mname =  new EditText(StartActivity.this);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Register");
        builder.setMessage("Just a quick step to get you quiz started.");
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        mname.setLayoutParams(lp);
        builder.setView(mname,50,0,50,0);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                setName(mname.getText().toString());
                Toast.makeText(StartActivity.this, getName(), Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }
}
