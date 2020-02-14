package com.example.quee;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {
    TextView optionA, optionB, optionC, optionD;
    TextView optionA1, optionB1, optionC1, optionD1;
    TextView questionNumber, question;
    Button next;
    boolean scoreFlagA = false, scoreFlagB = false, scoreFlagC = false, scoreFlagD = false;
    boolean check1 = false, check2 = false, check3 = false, check4 = false;
    int questionCounter = 1;
    int mCounter = 0;
    int scoreCounter = 0;

    //Array Methods
    public static String[] javaQuestions() {
        String[] java_Question = new String[10];
        java_Question[0] = "Earlier name of Java Programming language was?";
        java_Question[1] = "Which component is used to compile, debug and java program?";
        java_Question[2] = "Which component is responsible for converting bytecode into machine specific code?";
        java_Question[3] = "Which component is responsible to run java program?";
        java_Question[4] = "Which component is responsible to optimize bytecode to machine code?";
        java_Question[5] = "Which type of inheritance is not supported in Java?";
        java_Question[6] = "Which of the below is invalid identifier with the main method?";
        java_Question[7] = "What is the extension of Java code files?";
        java_Question[8] = "What is the extension of compiled Java classes?";
        java_Question[9] = "Which of these operators is used to allocate memory for an object?";
        return java_Question;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setTitle(R.string.your_title);
        setContentView(R.layout.activity_question);
        optionA = findViewById(R.id.optionA_tv);
        optionA1 = findViewById(R.id.optionA_tv1);
        optionB = findViewById(R.id.optionB_tv);
        optionB1 = findViewById(R.id.optionB_tv1);
        optionC = findViewById(R.id.optionC_tv);
        optionC1 = findViewById(R.id.optionC_tv1);
        optionD = findViewById(R.id.optionD_tv);
        optionD1 = findViewById(R.id.optionD_tv1);
        questionNumber = findViewById(R.id.questionNumber_tv);
        question = findViewById(R.id.question_tv);
        next = findViewById(R.id.next_bt);
        actionNext();
        checkIntent();
        actionOptionA();
        actionOptionA1();
        actionOptionB();
        actionOptionB1();
        actionOptionC();
        actionOptionC1();
        actionOptionD();
        actionOptionD1();

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("Are you sure you want to quit?")
                .setNegativeButton("No",null)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        QuestionActivity.super.onBackPressed();
                        finish();
                    }
                }).create().show();
    }

    public void actionOptionA() {
        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1 = true;
                check2 = false;
                check3 = false;
                check4 = false;
                scoreFlagA = true;
                isCheck();
                checkScore();
            }
        });
    }

    public void actionOptionA1() {
        optionA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1 = true;
                check2 = false;
                check3 = false;
                check4 = false;
                scoreFlagA = true;
                isCheck();
                checkScore();
            }
        });
    }

    public void actionOptionB() {
        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1 = false;
                check2 = true;
                check3 = false;
                check4 = false;
                scoreFlagB = true;
                isCheck();
                checkScore();
            }
        });
    }

    public void actionOptionB1() {
        optionB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1 = false;
                check2 = true;
                check3 = false;
                check4 = false;
                scoreFlagB = true;
                isCheck();
                checkScore();
            }
        });
    }

    public void actionOptionC() {
        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1 = false;
                check2 = false;
                check3 = true;
                check4 = false;
                scoreFlagC = true;
                isCheck();
                checkScore();
            }
        });
    }

    public void actionOptionC1() {
        optionC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1 = false;
                check2 = false;
                check3 = true;
                check4 = false;
                scoreFlagC = true;
                isCheck();
                checkScore();
            }
        });
    }

    public void actionOptionD() {
        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1 = false;
                check2 = false;
                check3 = false;
                check4 = true;
                scoreFlagD = true;
                isCheck();
                checkScore();
            }
        });
    }

    public void actionOptionD1() {
        optionD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1 = false;
                check2 = false;
                check3 = false;
                check4 = true;
                scoreFlagD = true;
                isCheck();
                checkScore();
            }
        });
    }

    public void isCheck() {
        if (check1 == true && check2 == false && check3 == false && check4 == false) {
            optionA.setBackgroundColor(Color.parseColor("#0E8D30"));
            optionA.setTextColor(Color.parseColor("#FFFFFF"));
            optionB.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionB.setTextColor(Color.parseColor("#000000"));
            optionC.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionC.setTextColor(Color.parseColor("#000000"));
            optionD.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionD.setTextColor(Color.parseColor("#000000"));
        } else if (check1 == false && check2 == true && check3 == false && check4 == false) {
            optionA.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionA.setTextColor(Color.parseColor("#000000"));
            optionB.setBackgroundColor(Color.parseColor("#0E8D30"));
            optionB.setTextColor(Color.parseColor("#FFFFFF"));
            optionC.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionC.setTextColor(Color.parseColor("#000000"));
            optionD.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionD.setTextColor(Color.parseColor("#000000"));
        } else if (check1 == false && check2 == false && check3 == true && check4 == false) {
            optionA.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionA.setTextColor(Color.parseColor("#000000"));
            optionB.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionB.setTextColor(Color.parseColor("#000000"));
            optionC.setBackgroundColor(Color.parseColor("#0E8D30"));
            optionC.setTextColor(Color.parseColor("#FFFFFF"));
            optionD.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionD.setTextColor(Color.parseColor("#000000"));
        } else if (check1 == false && check2 == false && check3 == false && check4 == true) {
            optionA.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionA.setTextColor(Color.parseColor("#000000"));
            optionB.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionB.setTextColor(Color.parseColor("#000000"));
            optionC.setBackgroundColor(Color.parseColor("#CCDBE6"));
            optionC.setTextColor(Color.parseColor("#000000"));
            optionD.setBackgroundColor(Color.parseColor("#0E8D30"));
            optionD.setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    public String[] getQuestion1Options() {
        String[] question1Options = new String[4];
        question1Options[0] = "Netbean";
        question1Options[1] = "Eclipse";
        question1Options[2] = "D";
        question1Options[3] = "OAK";
        return question1Options;
    }

    public String[] getQuestion2Options() {
        String[] question2Options = new String[4];
        question2Options[0] = "JVM";
        question2Options[1] = "JDK";
        question2Options[2] = "JIT";
        question2Options[3] = "JRE";
        return question2Options;
    }

    public String[] getQuestion3Options() {
        String[] question3Options = new String[4];
        question3Options[0] = "JVM";
        question3Options[1] = "JDK";
        question3Options[2] = "JIT";
        question3Options[3] = "JRE";
        return question3Options;
    }

    public String[] getQuestion4Options() {
        String[] question4Options = new String[4];
        question4Options[0] = "JVM";
        question4Options[1] = "JDK";
        question4Options[2] = "JIT";
        question4Options[3] = "JRE";
        return question4Options;
    }

    public String[] getQuestion5Options() {
        String[] question5Options = new String[4];
        question5Options[0] = "JVM";
        question5Options[1] = "JDK";
        question5Options[2] = "JIT";
        question5Options[3] = "JRE";
        return question5Options;
    }

    public String[] getQuestion6Options() {
        String[] question6Options = new String[4];
        question6Options[0] = "Single";
        question6Options[1] = "Multilevel";
        question6Options[2] = "Multiple";
        question6Options[3] = "None above";
        return question6Options;
    }

    public String[] getQuestion7Options() {
        String[] question7Options = new String[4];
        question7Options[0] = "public";
        question7Options[1] = "static";
        question7Options[2] = "private";
        question7Options[3] = "final";
        return question7Options;
    }

    public String[] getQuestion8Options() {
        String[] question8Options = new String[4];
        question8Options[0] = ".class";
        question8Options[1] = ".java";
        question8Options[2] = ".txt";
        question8Options[3] = ".js";
        return question8Options;
    }

    public String[] getQuestion9Options() {
        String[] question9Options = new String[4];
        question9Options[0] = ".class";
        question9Options[1] = ".java";
        question9Options[2] = ".txt";
        question9Options[3] = ".js";
        return question9Options;
    }

    public String[] getQuestion10Options() {
        String[] question10Options = new String[4];
        question10Options[0] = "malloc";
        question10Options[1] = "alloc";
        question10Options[2] = "new";
        question10Options[3] = "give";
        return question10Options;
    }

    public void checkIntent() {
        String title = getIntent().getStringExtra("title");

        //if the selected item is java

        if (title.equals("Java")) {
            String myQuestionCount = "Question " + questionCounter;
            if (questionCounter <= 10) {
                questionNumber.setText(myQuestionCount);
            }
            if (mCounter < 10) {
                String[] mQuestionArray = javaQuestions();
                question.setText(mQuestionArray[mCounter]);
            }
            if (questionCounter == 1) {
                String[] java_question1Option = getQuestion1Options();
                optionA.setText(java_question1Option[0]);
                optionB.setText(java_question1Option[1]);
                optionC.setText(java_question1Option[2]);
                optionD.setText(java_question1Option[3]);
            } else if (questionCounter == 2) {
                String[] java_question2Option = getQuestion2Options();
                optionA.setText(java_question2Option[0]);
                optionB.setText(java_question2Option[1]);
                optionC.setText(java_question2Option[2]);
                optionD.setText(java_question2Option[3]);
            } else if (questionCounter == 3) {
                String[] java_question3Option = getQuestion3Options();
                optionA.setText(java_question3Option[0]);
                optionB.setText(java_question3Option[1]);
                optionC.setText(java_question3Option[2]);
                optionD.setText(java_question3Option[3]);
            } else if (questionCounter == 4) {
                String[] java_question4Option = getQuestion4Options();
                optionA.setText(java_question4Option[0]);
                optionB.setText(java_question4Option[1]);
                optionC.setText(java_question4Option[2]);
                optionD.setText(java_question4Option[3]);
            } else if (questionCounter == 5) {
                String[] java_question5Option = getQuestion5Options();
                optionA.setText(java_question5Option[0]);
                optionB.setText(java_question5Option[1]);
                optionC.setText(java_question5Option[2]);
                optionD.setText(java_question5Option[3]);
            } else if (questionCounter == 6) {
                String[] java_question6Option = getQuestion6Options();
                optionA.setText(java_question6Option[0]);
                optionB.setText(java_question6Option[1]);
                optionC.setText(java_question6Option[2]);
                optionD.setText(java_question6Option[3]);
            } else if (questionCounter == 7) {
                String[] java_question7Option = getQuestion7Options();
                optionA.setText(java_question7Option[0]);
                optionB.setText(java_question7Option[1]);
                optionC.setText(java_question7Option[2]);
                optionD.setText(java_question7Option[3]);
            } else if (questionCounter == 8) {
                String[] java_question8Option = getQuestion8Options();
                optionA.setText(java_question8Option[0]);
                optionB.setText(java_question8Option[1]);
                optionC.setText(java_question8Option[2]);
                optionD.setText(java_question8Option[3]);
            } else if (questionCounter == 9) {
                String[] java_question9Option = getQuestion9Options();
                optionA.setText(java_question9Option[0]);
                optionB.setText(java_question9Option[1]);
                optionC.setText(java_question9Option[2]);
                optionD.setText(java_question9Option[3]);
            } else if (questionCounter == 10) {
                String[] java_question10Option = getQuestion10Options();
                optionA.setText(java_question10Option[0]);
                optionB.setText(java_question10Option[1]);
                optionC.setText(java_question10Option[2]);
                optionD.setText(java_question10Option[3]);
            }

        }

        //if the selected item is android

        if (title.equals("Android")) {
            Questions questions = new Questions();
            String[] androidQuestions = questions.getAndroidQuestion();
            String myQuestionCount = "Question " + questionCounter;
            if (questionCounter <= 10) {
                questionNumber.setText(myQuestionCount);
            }
            if (mCounter < 10) {
                question.setText(androidQuestions[mCounter]);
            }

            if (questionCounter == 1) {
                String[] android_question1Option = questions.getAndroidQuestion1Option();
                optionA.setText(android_question1Option[0]);
                optionB.setText(android_question1Option[1]);
                optionC.setText(android_question1Option[2]);
                optionD.setText(android_question1Option[3]);
            } else if (questionCounter == 2) {
                String[] android_question2Option = questions.getAndroidQuestion2Option();
                optionA.setText(android_question2Option[0]);
                optionB.setText(android_question2Option[1]);
                optionC.setText(android_question2Option[2]);
                optionD.setText(android_question2Option[3]);
            } else if (questionCounter == 3) {
                String[] android_question3Option = questions.getAndroidQuestion3Option();
                optionA.setText(android_question3Option[0]);
                optionB.setText(android_question3Option[1]);
                optionC.setText(android_question3Option[2]);
                optionD.setText(android_question3Option[3]);
            } else if (questionCounter == 4) {
                String[] android_question4Option = questions.getAndroidQuestion4Option();
                optionA.setText(android_question4Option[0]);
                optionB.setText(android_question4Option[1]);
                optionC.setText(android_question4Option[2]);
                optionD.setText(android_question4Option[3]);
            } else if (questionCounter == 5) {
                String[] android_question5Option = questions.getAndroidQuestion5Option();
                optionA.setText(android_question5Option[0]);
                optionB.setText(android_question5Option[1]);
                optionC.setText(android_question5Option[2]);
                optionD.setText(android_question5Option[3]);
            } else if (questionCounter == 6) {
                String[] android_question6Option = questions.getAndroidQuestion6Option();
                optionA.setText(android_question6Option[0]);
                optionB.setText(android_question6Option[1]);
                optionC.setText(android_question6Option[2]);
                optionD.setText(android_question6Option[3]);
            } else if (questionCounter == 7) {
                String[] android_question7Option = questions.getAndroidQuestion7Option();
                optionA.setText(android_question7Option[0]);
                optionB.setText(android_question7Option[1]);
                optionC.setText(android_question7Option[2]);
                optionD.setText(android_question7Option[3]);
            } else if (questionCounter == 8) {
                String[] android_question8Option = questions.getAndroidQuestion8Option();
                optionA.setText(android_question8Option[0]);
                optionB.setText(android_question8Option[1]);
                optionC.setText(android_question8Option[2]);
                optionD.setText(android_question8Option[3]);
            } else if (questionCounter == 9) {
                String[] android_question9Option = questions.getAndroidQuestion9Option();
                optionA.setText(android_question9Option[0]);
                optionB.setText(android_question9Option[1]);
                optionC.setText(android_question9Option[2]);
                optionD.setText(android_question9Option[3]);
            } else if (questionCounter == 10) {
                String[] android_question10Option = questions.getAndroidQuestion10Option();
                optionA.setText(android_question10Option[0]);
                optionB.setText(android_question10Option[1]);
                optionC.setText(android_question10Option[2]);
                optionD.setText(android_question10Option[3]);
            }
        }

        //if the selected item is c#

        if (title.equals("C Sharp")) {
            Questions questions = new Questions();
            String[] cSharpQuestions = questions.getcSharpQuestion();
            String myQuestionCount = "Question " + questionCounter;
            if (questionCounter <= 10) {
                questionNumber.setText(myQuestionCount);
            }
            if (mCounter < 10) {
                question.setText(cSharpQuestions[mCounter]);
            }

            if (questionCounter == 1) {
                String[] cSharp_question1Option = questions.getcSharpQuestion1Option();
                optionA.setText(cSharp_question1Option[0]);
                optionB.setText(cSharp_question1Option[1]);
                optionC.setText(cSharp_question1Option[2]);
                optionD.setText(cSharp_question1Option[3]);
            } else if (questionCounter == 2) {
                String[] cSharp_question2Option = questions.getcSharpQuestion2Option();
                optionA.setText(cSharp_question2Option[0]);
                optionB.setText(cSharp_question2Option[1]);
                optionC.setText(cSharp_question2Option[2]);
                optionD.setText(cSharp_question2Option[3]);
            } else if (questionCounter == 3) {
                String[] cSharp_question3Option = questions.getcSharpQuestion3Option();
                optionA.setText(cSharp_question3Option[0]);
                optionB.setText(cSharp_question3Option[1]);
                optionC.setText(cSharp_question3Option[2]);
                optionD.setText(cSharp_question3Option[3]);
            } else if (questionCounter == 4) {
                String[] cSharp_question4Option = questions.getcSharpQuestion4Option();
                optionA.setText(cSharp_question4Option[0]);
                optionB.setText(cSharp_question4Option[1]);
                optionC.setText(cSharp_question4Option[2]);
                optionD.setText(cSharp_question4Option[3]);
            } else if (questionCounter == 5) {
                String[] cSharp_question5Option = questions.getcSharpQuestion5Option();
                optionA.setText(cSharp_question5Option[0]);
                optionB.setText(cSharp_question5Option[1]);
                optionC.setText(cSharp_question5Option[2]);
                optionD.setText(cSharp_question5Option[3]);
            } else if (questionCounter == 6) {
                String[] cSharp_question6Option = questions.getcSharpQuestion6Option();
                optionA.setText(cSharp_question6Option[0]);
                optionB.setText(cSharp_question6Option[1]);
                optionC.setText(cSharp_question6Option[2]);
                optionD.setText(cSharp_question6Option[3]);
            } else if (questionCounter == 7) {
                String[] cSharp_question7Option = questions.getcSharpQuestion7Option();
                optionA.setText(cSharp_question7Option[0]);
                optionB.setText(cSharp_question7Option[1]);
                optionC.setText(cSharp_question7Option[2]);
                optionD.setText(cSharp_question7Option[3]);
            } else if (questionCounter == 8) {
                String[] cSharp_question8Option = questions.getcSharpQuestion8Option();
                optionA.setText(cSharp_question8Option[0]);
                optionB.setText(cSharp_question8Option[1]);
                optionC.setText(cSharp_question8Option[2]);
                optionD.setText(cSharp_question8Option[3]);
            } else if (questionCounter == 9) {
                String[] cSharp_question9Option = questions.getcSharpQuestion9Option();
                optionA.setText(cSharp_question9Option[0]);
                optionB.setText(cSharp_question9Option[1]);
                optionC.setText(cSharp_question9Option[2]);
                optionD.setText(cSharp_question9Option[3]);
            } else if (questionCounter == 10) {
                String[] cSharp_question10Option = questions.getcSharpQuestion10Option();
                optionA.setText(cSharp_question10Option[0]);
                optionB.setText(cSharp_question10Option[1]);
                optionC.setText(cSharp_question10Option[2]);
                optionD.setText(cSharp_question10Option[3]);
            }
        }

        //if the selected item is database

        if (title.equals("Sql Database")) {
            Questions questions = new Questions();
            String[] sqlDatabaseQuestions = questions.getSqlDatabaseQuestion();
            String myQuestionCount = "Question " + questionCounter;
            if (questionCounter <= 10) {
                questionNumber.setText(myQuestionCount);
            }
            if (mCounter < 10) {
                question.setText(sqlDatabaseQuestions[mCounter]);
            }

            if (questionCounter == 1) {
                String[] sqlDatabase_question1Option = questions.getSqlDatabaseQuestion1Option();
                optionA.setText(sqlDatabase_question1Option[0]);
                optionB.setText(sqlDatabase_question1Option[1]);
                optionC.setText(sqlDatabase_question1Option[2]);
                optionD.setText(sqlDatabase_question1Option[3]);
            } else if (questionCounter == 2) {
                String[] sqlDatabase_question2Option = questions.getSqlDatabaseQuestion2Option();
                optionA.setText(sqlDatabase_question2Option[0]);
                optionB.setText(sqlDatabase_question2Option[1]);
                optionC.setText(sqlDatabase_question2Option[2]);
                optionD.setText(sqlDatabase_question2Option[3]);
            } else if (questionCounter == 3) {
                String[] sqlDatabase_question3Option = questions.getSqlDatabaseQuestion3Option();
                optionA.setText(sqlDatabase_question3Option[0]);
                optionB.setText(sqlDatabase_question3Option[1]);
                optionC.setText(sqlDatabase_question3Option[2]);
                optionD.setText(sqlDatabase_question3Option[3]);
            } else if (questionCounter == 4) {
                String[] sqlDatabase_question4Option = questions.getSqlDatabaseQuestion4Option();
                optionA.setText(sqlDatabase_question4Option[0]);
                optionB.setText(sqlDatabase_question4Option[1]);
                optionC.setText(sqlDatabase_question4Option[2]);
                optionD.setText(sqlDatabase_question4Option[3]);
            } else if (questionCounter == 5) {
                String[] sqlDatabase_question5Option = questions.getSqlDatabaseQuestion5Option();
                optionA.setText(sqlDatabase_question5Option[0]);
                optionB.setText(sqlDatabase_question5Option[1]);
                optionC.setText(sqlDatabase_question5Option[2]);
                optionD.setText(sqlDatabase_question5Option[3]);
            } else if (questionCounter == 6) {
                String[] sqlDatabase_question6Option = questions.getSqlDatabaseQuestion6Option();
                optionA.setText(sqlDatabase_question6Option[0]);
                optionB.setText(sqlDatabase_question6Option[1]);
                optionC.setText(sqlDatabase_question6Option[2]);
                optionD.setText(sqlDatabase_question6Option[3]);
            } else if (questionCounter == 7) {
                String[] sqlDatabase_question7Option = questions.getSqlDatabaseQuestion7Option();
                optionA.setText(sqlDatabase_question7Option[0]);
                optionB.setText(sqlDatabase_question7Option[1]);
                optionC.setText(sqlDatabase_question7Option[2]);
                optionD.setText(sqlDatabase_question7Option[3]);
            } else if (questionCounter == 8) {
                String[] sqlDatabase_question8Option = questions.getSqlDatabaseQuestion8Option();
                optionA.setText(sqlDatabase_question8Option[0]);
                optionB.setText(sqlDatabase_question8Option[1]);
                optionC.setText(sqlDatabase_question8Option[2]);
                optionD.setText(sqlDatabase_question8Option[3]);
            } else if (questionCounter == 9) {
                String[] sqlDatabase_question9Option = questions.getcSharpQuestion9Option();
                optionA.setText(sqlDatabase_question9Option[0]);
                optionB.setText(sqlDatabase_question9Option[1]);
                optionC.setText(sqlDatabase_question9Option[2]);
                optionD.setText(sqlDatabase_question9Option[3]);
            } else if (questionCounter == 10) {
                String[] sqlDatabase_question10Option = questions.getSqlDatabaseQuestion10Option();
                optionA.setText(sqlDatabase_question10Option[0]);
                optionB.setText(sqlDatabase_question10Option[1]);
                optionC.setText(sqlDatabase_question10Option[2]);
                optionD.setText(sqlDatabase_question10Option[3]);
            }
        }

        //if the selected item is data structures

        if (title.equals("Data Structures")) {
            Questions questions = new Questions();
            String[] dataStructuresQuestions = questions.getDataStructuresQuestion();
            String myQuestionCount = "Question " + questionCounter;
            if (questionCounter <= 10) {
                questionNumber.setText(myQuestionCount);
            }
            if (mCounter < 10) {
                question.setText(dataStructuresQuestions[mCounter]);
            }

            if (questionCounter == 1) {
                String[] dataStructures_question1Option = questions.getDataStructuresQuestion1Option();
                optionA.setText(dataStructures_question1Option[0]);
                optionB.setText(dataStructures_question1Option[1]);
                optionC.setText(dataStructures_question1Option[2]);
                optionD.setText(dataStructures_question1Option[3]);
            } else if (questionCounter == 2) {
                String[] dataStructures_question2Option = questions.getDataStructuresQuestion2Option();
                optionA.setText(dataStructures_question2Option[0]);
                optionB.setText(dataStructures_question2Option[1]);
                optionC.setText(dataStructures_question2Option[2]);
                optionD.setText(dataStructures_question2Option[3]);
            } else if (questionCounter == 3) {
                String[] dataStructures_question3Option = questions.getDataStructuresQuestion3Option();
                optionA.setText(dataStructures_question3Option[0]);
                optionB.setText(dataStructures_question3Option[1]);
                optionC.setText(dataStructures_question3Option[2]);
                optionD.setText(dataStructures_question3Option[3]);
            } else if (questionCounter == 4) {
                String[] dataStructures_question4Option = questions.getDataStructuresQuestion4Option();
                optionA.setText(dataStructures_question4Option[0]);
                optionB.setText(dataStructures_question4Option[1]);
                optionC.setText(dataStructures_question4Option[2]);
                optionD.setText(dataStructures_question4Option[3]);
            } else if (questionCounter == 5) {
                String[] dataStructures_question5Option = questions.getDataStructuresQuestion5Option();
                optionA.setText(dataStructures_question5Option[0]);
                optionB.setText(dataStructures_question5Option[1]);
                optionC.setText(dataStructures_question5Option[2]);
                optionD.setText(dataStructures_question5Option[3]);
            } else if (questionCounter == 6) {
                String[] dataStructures_question6Option = questions.getDataStructuresQuestion6Option();
                optionA.setText(dataStructures_question6Option[0]);
                optionB.setText(dataStructures_question6Option[1]);
                optionC.setText(dataStructures_question6Option[2]);
                optionD.setText(dataStructures_question6Option[3]);
            } else if (questionCounter == 7) {
                String[] dataStructures_question7Option = questions.getDataStructuresQuestion7Option();
                optionA.setText(dataStructures_question7Option[0]);
                optionB.setText(dataStructures_question7Option[1]);
                optionC.setText(dataStructures_question7Option[2]);
                optionD.setText(dataStructures_question7Option[3]);
            } else if (questionCounter == 8) {
                String[] dataStructures_question8Option = questions.getDataStructuresQuestion8Option();
                optionA.setText(dataStructures_question8Option[0]);
                optionB.setText(dataStructures_question8Option[1]);
                optionC.setText(dataStructures_question8Option[2]);
                optionD.setText(dataStructures_question8Option[3]);
            } else if (questionCounter == 9) {
                String[] dataStructures_question9Option = questions.getDataStructuresQuestion9Option();
                optionA.setText(dataStructures_question9Option[0]);
                optionB.setText(dataStructures_question9Option[1]);
                optionC.setText(dataStructures_question9Option[2]);
                optionD.setText(dataStructures_question9Option[3]);
            } else if (questionCounter == 10) {
                String[] dataStructures_question10Option = questions.getDataStructuresQuestion10Option();
                optionA.setText(dataStructures_question10Option[0]);
                optionB.setText(dataStructures_question10Option[1]);
                optionC.setText(dataStructures_question10Option[2]);
                optionD.setText(dataStructures_question10Option[3]);
            }
        }
    }

    public void actionNext() {
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button Color Change on next Question Press

                optionA.setBackgroundColor(Color.parseColor("#CCDBE6"));
                optionA.setTextColor(Color.parseColor("#000000"));
                optionB.setBackgroundColor(Color.parseColor("#CCDBE6"));
                optionB.setTextColor(Color.parseColor("#000000"));
                optionC.setBackgroundColor(Color.parseColor("#CCDBE6"));
                optionC.setTextColor(Color.parseColor("#000000"));
                optionD.setBackgroundColor(Color.parseColor("#CCDBE6"));
                optionD.setTextColor(Color.parseColor("#000000"));

                //Counters
                questionCounter++;
                mCounter++;

                checkIntent();

                //New Activity Condition

                if (questionCounter > 10) {
                    int myScore = checkScore();
                    Intent intent = new Intent(QuestionActivity.this, ResultActivity.class);
                    intent.putExtra("score", myScore);
                    String title = getIntent().getStringExtra("title");
                    intent.putExtra("ntitle", title);
                    intent.putExtra("nName",getIntent().getStringExtra("mName"));
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    public int checkScore() {

        String title = getIntent().getStringExtra("title");

//        int colorA =optionA.getCurrentTextColor();
//        int colorB =optionB.getCurrentTextColor();
//        int colorC =optionC.getCurrentTextColor();
//        int colorD =optionD.getCurrentTextColor();
//        String mColorA=String.format("#%06X", (0xFFFFFF & colorA));
//        String mColorB=String.format("#%06X", (0xFFFFFF & colorB));
//        String mColorC=String.format("#%06X", (0xFFFFFF & colorC));
//        String mColorD=String.format("#%06X", (0xFFFFFF & colorD));
//        String color = "#ffffff";

        if (title.equals("Java")) {

            if (questionCounter == 1 && scoreFlagD == true) {
                scoreFlagD = false;
                scoreCounter++;
            }
            if (questionCounter == 2 && scoreFlagB == true) {
                scoreFlagB = false;
                scoreCounter++;
            }
            if (questionCounter == 3 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 4 && scoreFlagD == true) {
                scoreFlagD = false;
                scoreCounter++;
            }
            if (questionCounter == 5 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 6 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 7 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 8 && scoreFlagB == true) {
                scoreFlagB = false;
                scoreCounter++;
            }
            if (questionCounter == 9 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 10 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
        }

        //if selected item is android

        if (title.equals("Android")) {

            if (questionCounter == 1 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 2 && scoreFlagD == true) {
                scoreFlagD = false;
                scoreCounter++;
            }
            if (questionCounter == 3 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 4 && scoreFlagD == true) {
                scoreFlagD = false;
                scoreCounter++;
            }
            if (questionCounter == 5 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 6 && scoreFlagB == true) {
                scoreFlagB = false;
                scoreCounter++;
            }
            if (questionCounter == 7 && scoreFlagB == true) {
                scoreFlagB = false;
                scoreCounter++;
            }
            if (questionCounter == 8 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 9 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 10 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
        }

        //if the selected item c#

        if (title.equals("C Sharp")) {

            if (questionCounter == 1 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 2 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 3 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 4 && scoreFlagB == true) {
                scoreFlagB = false;
                scoreCounter++;
            }
            if (questionCounter == 5 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 6 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 7 && scoreFlagD == true) {
                scoreFlagD = false;
                scoreCounter++;
            }
            if (questionCounter == 8 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 9 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 10 && scoreFlagB == true) {
                scoreFlagB = false;
                scoreCounter++;
            }
        }

        //if selected item is sql database

        if (title.equals("Sql Database")) {

            if (questionCounter == 1 && scoreFlagB == true) {
                scoreFlagB = false;
                scoreCounter++;
            }
            if (questionCounter == 2 && scoreFlagB == true) {
                scoreFlagB = false;
                scoreCounter++;
            }
            if (questionCounter == 3 && scoreFlagD == true) {
                scoreFlagD = false;
                scoreCounter++;
            }
            if (questionCounter == 4 && scoreFlagB == true) {
                scoreFlagB = false;
                scoreCounter++;
            }
            if (questionCounter == 5 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 6 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 7 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 8 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 9 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
            if (questionCounter == 10 && scoreFlagC == true) {
                scoreFlagC = false;
                scoreCounter++;
            }
        }

        //if the selected item is data structures

        if (title.equals("Data Structures")) {

            if (questionCounter == 1 && scoreFlagD == true) {
                scoreFlagD = false;
                scoreCounter++;
            }
            if (questionCounter == 2 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 3 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 4 && scoreFlagD == true) {
                scoreFlagD = false;
                scoreCounter++;
            }
            if (questionCounter == 5 && scoreFlagD == true) {
                scoreFlagD = false;
                scoreCounter++;
            }
            if (questionCounter == 6 && scoreFlagB == true) {
                scoreFlagB = false;
                scoreCounter++;
            }
            if (questionCounter == 7 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 8 && scoreFlagB == true) {
                scoreFlagB = false;
                scoreCounter++;
            }
            if (questionCounter == 9 && scoreFlagA == true) {
                scoreFlagA = false;
                scoreCounter++;
            }
            if (questionCounter == 10 && scoreFlagD == true) {
                scoreFlagD = false;
                scoreCounter++;
            }
        }

        return scoreCounter;
    }
}
