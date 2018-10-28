package com.example.root.calculator.feature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        double x1 = Double.NaN;
        double x2;
        decimalFormat = new DecimalFormat("#.##########");

        final char ADDITION = '+';
        final char SUBTRACTION = '-';
        final char MULTIPLICATION = '*';
        final char DIVISION = '/';

        final char CURRENT_ACTION;


        Button numZero = (Button) findViewById(R.id.numZero);
        Button numOne = (Button) findViewById(R.id.numOne);
        Button numTwo = (Button) findViewById(R.id.numTwo);
        Button numThree = (Button) findViewById(R.id.numThree);
        Button numFour = (Button) findViewById(R.id.numFour);
        Button numFive = (Button) findViewById(R.id.numFive);
        Button numSix = (Button) findViewById(R.id.numSix);
        Button numSeven = (Button) findViewById(R.id.numSeven);
        Button numEight = (Button) findViewById(R.id.numEight);
        Button numNine = (Button) findViewById(R.id.numNine);
        Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        Button buttonSub = (Button) findViewById(R.id.buttonSub);
        Button buttonMul = (Button) findViewById(R.id.buttonMul);
        Button buttonDiv = (Button) findViewById(R.id.buttonDiv);

        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        numZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText() + "0");
            }
        });

        numOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText() + "1");
            }
        });

        numTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText() + "2");
            }
        });

        numThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText() + "3");
            }
        });

        numFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText() + "4");
            }
        });

        numFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText() + "5");
            }
        });

        numSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText() + "6");
            }
        });

        numSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText() + "7");
            }
        });

        numEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText() + "8");
            }
        });

        numNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText() + "9");
            }
        });

        private final void computeCalculation(){
            if(!Double.isNaN(x1)){
                x2 = Double.parseDouble(resultTextView.getText().toString());
                resultTextView.setText(null);

                if (CURRENT_ACTION == ADDITION)
                    x1 = x1 + x2;
                else if(CURRENT_ACTION == SUBTRACTION)
                    x1 = x1 - x2;
                else if(CURRENT_ACTION == MULTIPLICATION)
                    x1 = x1 * x2;
                else if(CURRENT_ACTION == DIVISION)
                    x1 = x1 / x2;
            }
            else {
                try {
                    x1 = Double.parseDouble(resultTextView.getText().toString());
                }
                catch (Exception e){}
            }
        }



        /*buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCalculation();
                CURRENT_ACTION = ADDITION;
                resultTextView.setText(decimalFormat.format(x1) + "+");
                resultTextView.setText(null);
            }
        });*/
    }
}
