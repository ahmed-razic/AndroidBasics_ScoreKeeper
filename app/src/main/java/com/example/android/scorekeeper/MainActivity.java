package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scoreRedCardA = 0;
    int scoreRedCardB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayGoalsTeamA(scoreTeamA);
        displayGoalsTeamB(scoreTeamB);
        displayRedCardsTeamA(scoreRedCardA);
        displayRedCardsTeamB(scoreRedCardB);
    }

    private void displayGoalsTeamA(int score) {
        TextView scoreViewA = (TextView) findViewById(R.id.score_team_a);
        scoreViewA.setText(String.valueOf(scoreTeamA));
    }

    private void displayRedCardsTeamA(int score) {
        TextView cardViewA = findViewById(R.id.score_red_card_a);
        cardViewA.setText(String.valueOf(scoreRedCardA));
    }

    private void displayGoalsTeamB(int score) {
        TextView scoreViewB = (TextView) findViewById(R.id.score_team_b);
        scoreViewB.setText(String.valueOf(scoreTeamB));
    }

    private void displayRedCardsTeamB(int score) {
        TextView cardViewB = findViewById(R.id.score_red_card_b);
        cardViewB.setText(String.valueOf(scoreRedCardB));
    }

    public void addGoalTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayGoalsTeamA(scoreTeamA);
    }

    public void addPenaltyGoalTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayGoalsTeamA(scoreTeamA);
    }

    public void addRedCardTeamA(View v) {
        scoreRedCardA = scoreRedCardA + 1;
        displayRedCardsTeamA(scoreRedCardA);
    }

    public void addGoalTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalsTeamB(scoreTeamB);
    }

    public void addPenaltyGoalTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayGoalsTeamB(scoreTeamB);
    }

    public void addRedCardTeamB(View v) {
        scoreRedCardB = scoreRedCardB + 1;
        displayRedCardsTeamB(scoreRedCardB);
    }

    public void resetScore(View v) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreRedCardA = 0;
        scoreRedCardB = 0;

        displayGoalsTeamA(scoreTeamA);
        displayGoalsTeamB(scoreTeamB);
        displayRedCardsTeamA(scoreRedCardA);
        displayRedCardsTeamB(scoreRedCardB);
    }


}