package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button add;
    Button mul;
    Button sub;
    Button div;

    EditText firstNum;
    EditText secondNum;

    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.AddBtn);
        mul = findViewById(R.id.MulBtn);
        sub = findViewById(R.id.SubBtn);
        div =  findViewById(R.id.DivBtn);
        firstNum = findViewById(R.id.first_num);
        secondNum = findViewById(R.id.second_num);
        result = findViewById(R.id.resultView);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = firstNum.getText().toString();
                String second = secondNum.getText().toString();
                if(first.equals("")&&second.equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter Values First", Toast.LENGTH_SHORT).show();
                }
                int a = Integer.parseInt(first);
                int b = Integer.parseInt(second);
                int sum = a+b;
                result.setText("Sum is: "+ sum);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = firstNum.getText().toString();
                String second = secondNum.getText().toString();
                if(first.equals("")&&second.equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter Values First", Toast.LENGTH_SHORT).show();
                }
                else{
                    int a = Integer.parseInt(first);
                    int b = Integer.parseInt(second);
                    int prod = a*b;
                    result.setText("Prod is: "+ prod);
                }

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = firstNum.getText().toString();
                String second = secondNum.getText().toString();
                if(first.equals("")&&second.equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter Values First", Toast.LENGTH_SHORT).show();
                }
                else{
                    int a = Integer.parseInt(first);
                    int b = Integer.parseInt(second);
                    int divide = a/b;
                    result.setText("Sum is: "+ divide);
                }

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = firstNum.getText().toString();
                String second = secondNum.getText().toString();
                if(first.equals("")&&second.equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter Values First", Toast.LENGTH_SHORT).show();
                }
                else{
                    int a = Integer.parseInt(first);
                    int b = Integer.parseInt(second);
                    int subtract = a-b;
                    result.setText("Diff is: "+ subtract);
                }

            }
        });







    }



}