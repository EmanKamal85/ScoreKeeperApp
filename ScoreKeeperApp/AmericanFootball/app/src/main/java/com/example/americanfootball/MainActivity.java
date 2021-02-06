package com.example.americanfootball;

/**
 * IMPORTANT: Make sure you are using the correct package name.
 * <p>
 * This example uses the package name:
 * <p>
 * package com.example.courtcounter
 * <p>
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * <p>
 * in the project's AndroidManifest.xml file.
 **/

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


/**
 * This app displays an order form to order coffee.
 */

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }


    /**
     * This method is called when the order button is clicked.
     */
    public void addSixPointsA(View view) {
        scoreA+=6;
        displayForTeamA(scoreA);
    }

    public void addThreePointsA(View view) {
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void addOnePointA(View view) {
        scoreA+=1;
        displayForTeamA(scoreA);

    }

    public void addTwoPointsA(View view) {
        scoreA+=2;
        displayForTeamA(scoreA);

    }




    /**
     * This method displays the given quantity value on the screen.
     */

    private void displayForTeamA(int number) {

        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);

        scoreTextView.setText("" + number);

    }

    public void addSixPointsB(View view) {
        scoreB+=6;
        displayForTeamB(scoreB);
    }

    public void addThreePointsB(View view) {
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void addOnePointB(View view) {
        scoreB+=1;
        displayForTeamB(scoreB);

    }

    public void addTwoPointsB(View view) {
        scoreB+=2;
        displayForTeamB(scoreB);

    }



    public  void reset(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }


    /**
     * This method displays the given quantity value on the screen.
     */

    private void displayForTeamB(int number) {

        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);

        scoreTextView.setText("" + number);

    }




    /**
     * This method displays the given price on the screen.
     */


}