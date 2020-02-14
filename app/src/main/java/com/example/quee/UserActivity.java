package com.example.quee;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserActivity extends AppCompatActivity {
    EditText to,sub,messageText;
    Button send;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        to = findViewById(R.id.editText_to);
        sub = findViewById(R.id.editText_subject);
        messageText = findViewById(R.id.editText_message);
        send = findViewById(R.id.button_send);
        String score = "Hey checkout my score "+getIntent().getStringExtra("mscore")+" in "+getIntent().getStringExtra("mtitle")+" quiz.";
        messageText.setText(score);
        sendAction();
    }
    public void sendAction(){
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send();
                if(counter == 1){
                    finish();
                }
            }
        });
    }

    public void send(){
        String recipientsList = to.getText().toString();
        String [] recipients = recipientsList.split(",");
        String subject = sub.getText().toString();
        String message = messageText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,message);

        intent.setType("message/rfc822");

        startActivity(Intent.createChooser(intent,"Choose an Email client"));
        counter++;
    }
}
