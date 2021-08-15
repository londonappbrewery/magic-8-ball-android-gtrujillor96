package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Image View state
        final ImageView ballDisplay = (ImageView) findViewById(R.id.imageBall);

        //Array Variable
        final int[] ballArray = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        //Button Instance and link to activity
        Button askButton = (Button) findViewById(R.id.askButton);

        //Button listener with the on click method
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Generate the random number
                Random randomNumberGenerator = new Random();
                int randomNumber = randomNumberGenerator.nextInt(5);

                //Random number to the imageView
                ballDisplay.setImageResource(ballArray[randomNumber]);
            }
        });
    }
}
