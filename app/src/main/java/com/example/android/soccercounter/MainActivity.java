package com.example.android.soccercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeam1 = 0;
    int scoreTeam2 = 0;
    int scoreYellow = 0;
    int scoreRed = 0;
    int scoreYellow2 = 0;
    int scoreRed2 = 0;

    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Team1);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForYellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.YellowScore);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForRed(int score) { //red
        TextView scoreView = (TextView) findViewById(R.id.RedScore);
        scoreView.setText(String.valueOf(score));

    }


    public void onScore(View v) {
        scoreTeam1 = scoreTeam1 + 1;
        displayForTeam1(scoreTeam1);
    }

    public void onYellow(View v) {
        scoreYellow = scoreYellow + 1;
        displayForYellow(scoreYellow);
    }

    public void onRed(View v) {
        scoreRed = scoreRed + 1;
        displayForRed(scoreRed);

    }


    public void onScore2(View v) {
        scoreTeam2 = scoreTeam2 + 1;
        displayForTeam2(scoreTeam2);
    }

    public void onYellow2(View v) {
        scoreYellow2 = scoreYellow2 + 1;
        displayForYellow2(scoreYellow2);
    }

    public void onRed2(View v) {
        scoreRed2 = scoreRed2 + 1;
        displayForRed2(scoreRed2);

    }

    public void onReset(View v) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        scoreRed = 0;
        scoreRed2 = 0;
        scoreYellow = 0;
        scoreYellow2 = 0;

        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
        displayForRed(scoreRed);
        displayForRed2(scoreRed2);
        displayForYellow(scoreYellow);
        displayForYellow2(scoreYellow2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Team2);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForYellow2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.YellowScore2);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForRed2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.RedScore2);
        scoreView.setText(String.valueOf(score));

    }
}
