package com.example.matth.morpion;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by matth on 31/01/2018.
 */

public class MainActivity extends Activity {

    Button pion0;
    Button pion1;
    Button pion2;
    Button pion3;
    Button pion4;
    Button pion5;
    Button pion6;
    Button pion7;
    Button pion8;
    TextView gameStatus;
    Button replayButton;
    ImageView morpionImageView;
    Button[] pions = new Button[9];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        initialize();
        bindEventsListenerOnButtons();

    }

    private void bindEventsListenerOnButtons() {
        for(Button pion : pions){
            pion.setOnClickListener(pionListener);
        }
        replayButton.setOnClickListener(replayListener);
    }

    private View.OnClickListener pionListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
     private View.OnClickListener replayListener = new View.OnClickListener() {
         @Override
         public void onClick(View v) {

         }
     }
    private void initialize() {
        pion0 = findViewById(R.id.pion0);
        pion1 = findViewById(R.id.pion0);
        pion2 = findViewById(R.id.pion0);
        pion3 = findViewById(R.id.pion0);
        pion4 = findViewById(R.id.pion0);
        pion5 = findViewById(R.id.pion0);
        pion6 = findViewById(R.id.pion0);
        pion7 = findViewById(R.id.pion0);
        pion8 = findViewById(R.id.pion0);

        gameStatus = findViewById(R.id.gameStatus);

        replayButton = findViewById(R.id.replayButton);

        morpionImageView = findViewById(R.id.morpionImageView);
        pions[0] = pion0;
        pions[1] = pion1;
        pions[2] = pion2;
        pions[3] = pion3;
        pions[4] = pion4;
        pions[5] = pion5;
        pions[6] = pion6;
        pions[7] = pion7;
        pions[8] = pion8;
    }
}
