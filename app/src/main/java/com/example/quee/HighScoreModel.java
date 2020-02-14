package com.example.quee;

public class HighScoreModel {
    private String catName = "";
    private String highScore = "";
    private String time = "";
    private String name = "";

    public HighScoreModel() {
    }

    public HighScoreModel(String catName, String highScore, String time, String name) {
        this.catName = catName;
        this.highScore = highScore;
        this.time = time;
        this.name = name;
    }

    public String getCatName() {
        return catName;
    }

    public String getHighScore() {
        return highScore;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }
}
