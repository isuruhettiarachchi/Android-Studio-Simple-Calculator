package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


// mXparser for solve math expression
import org.mariuszgromada.math.mxparser.*;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // declare buttons
    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero;
    Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEquals, buttonDecimal, buttonClear;

    // declare textViews
    EditText mathExpression;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign buttons
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonZero = findViewById(R.id.buttonZero);

        buttonDecimal = findViewById(R.id.buttonDecimal);
        buttonEquals = findViewById(R.id.buttonEqual);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonClear = findViewById(R.id.buttonClear);

        // assign textViews
        mathExpression = findViewById(R.id.mathExpression);
        answer = findViewById(R.id.mathResult);

        // disable soft input in edit text
        mathExpression.setShowSoftInputOnFocus(false);

        // button 1 click
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"1"); // add 1 to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button 2 click
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"2"); // add 2 to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button 3 click
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"3"); // add 3 to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e));// set answer
            }
        });

        // button 4 click
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"4"); // add 4 to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button 5 click
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"5"); // add 5 to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button 6 click
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"6"); // add 6 to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button 7 click
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"7"); // add 7 to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button 8 click
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"8"); // add 8 to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button 9 click
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"9"); // add 9 to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button 0 click
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"0"); // add 0 to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button decimal click
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mathExpression.getText().toString().contains(".")) {
                    mathExpression.setText(mathExpression.getText()+"."); // add . to expression
                    Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                    answer.setText(ExpressValues(e)); // set answer
                }
            }
        });

        // button equals click
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(answer.getText()); // set answer to expression textView
            }
        });

        // button add click
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"+"); // add + to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button subtract click
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"-"); // add - to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button multiply click
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"*"); // add * to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button divide click
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(mathExpression.getText()+"/"); // add / to expression
                Expression e = new Expression(mathExpression.getText().toString()); // create new expression
                answer.setText(ExpressValues(e)); // set answer
            }
        });

        // button C click
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathExpression.setText(""); // clear values from text view
                answer.setText(""); // clear values from text view
            }
        });


    }

    // math expression parser using mXparser library
    String ExpressValues(Expression expression) {
        double result = expression.calculate();
        DecimalFormat format = new DecimalFormat("0.#"); // format answer to remove trailing zeros
        if (!Double.isNaN(result)) {
            return String.valueOf(format.format(result));
        }
        return answer.getText().toString();
    }

}
