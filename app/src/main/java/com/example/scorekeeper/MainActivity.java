package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teamAScoreTextView;
    TextView teamAFoulsTextView;

    TextView teamBScoreTextView;
    TextView teamBFoulsTextView;

    int teamAScore;
    int teamAFouls;

    int teamBScore;
    int teamBFouls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScoreTextView = findViewById(R.id.team_a_score);
        teamAFoulsTextView = findViewById(R.id.team_a_fouls);

        teamBScoreTextView = findViewById(R.id.team_b_score);
        teamBFoulsTextView = findViewById(R.id.team_b_fouls);
    }

    public void TeamAAdd1Point(View v){
        teamAScore += 1;
        displayForTeamAScore(teamAScore);
    }

    public void TeamAAddFoul(View v){
        teamAFouls += 1;
        displayForTeamAFoul(teamAFouls);
    }


    public void TeamBAdd1Point(View v){
        teamBScore += 1;
        displayForTeamBScore(teamBScore);
    }

    public void TeamBAddFoul(View v){
        teamBFouls += 1;
        displayForTeamBFoul(teamBFouls);
    }

    public void displayForTeamAScore(int score){
        teamAScoreTextView.setText(String.valueOf(score));
    }

    public void displayForTeamAFoul(int foul){
        teamAFoulsTextView.setText(String.valueOf(foul));
    }

    public void displayForTeamBScore(int score){
        teamBScoreTextView.setText(String.valueOf(score));
    }

    public void displayForTeamBFoul(int foul){
        teamBFoulsTextView.setText(String.valueOf(foul));
    }

    public void reset(View v){
        teamAScore = 0;
        teamAFouls = 0;

        teamBScore = 0;
        teamBFouls = 0;

        displayForTeamAScore(teamAScore);
        displayForTeamAFoul(teamAFouls);

        displayForTeamBFoul(teamBFouls);
        displayForTeamBScore(teamBScore);

    }
}
