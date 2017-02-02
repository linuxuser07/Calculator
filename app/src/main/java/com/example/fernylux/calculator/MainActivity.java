package com.example.fernylux.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //fields
    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initilizing the operands on Create
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        txtResult = (TextView) findViewById(R.id.txtResult);

        //listeners for the buttons

        btnAddition.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Creating the variables to store the values of the operation
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());

                //adding the actual value
                double theResult = oper1 + oper2;

                txtResult.setText(Double.toString(theResult));

            }

        });

        btnSubtraction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Creating the variables to store the values of the operation
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());

                //adding the actual value
                double theResult = oper1 - oper2;

                txtResult.setText(Double.toString(theResult));

            }

        });
        btnDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Creating the variables to store the values of the operation
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());

                //adding the actual value
                double theResult = oper1 / oper2;

                txtResult.setText(Double.toString(theResult));

            }

        });

        btnMultiplication.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Creating the variables to store the values of the operation
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());

                //adding the actual value
                double theResult = oper1 * oper2;

                txtResult.setText(Double.toString(theResult));

            }

        });

    }
}
