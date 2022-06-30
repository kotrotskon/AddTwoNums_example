package com.example.addtwonums_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edTxt_num1;
    EditText edTxt_num2;
    EditText edTxt_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTxt_num1 = findViewById(R.id.edTxt_num1);
        edTxt_num2 = findViewById(R.id.edTxt_num2);
        edTxt_result = findViewById(R.id.edTxt_result);

        Button btn_add = findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
        Button btn_min = findViewById(R.id.btn_min);
        btn_min.setOnClickListener(this);
        Button btn_mul = findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(this);
        Button btn_div = findViewById(R.id.btn_div);
        btn_div.setOnClickListener(this);
        Button btn_clr = findViewById(R.id.btn_clr);

        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edTxt_num1.setText("");
                edTxt_num2.setText("");
                edTxt_result.setText("");
            }
        });
    }

    @Override
    public void onClick(View view) {
        String strNum1 = edTxt_num1.getText().toString();
        String strNum2 = edTxt_num2.getText().toString();

        double num1 = Double.valueOf(strNum1);
        double num2 = Double.valueOf(strNum2);

        double result = 0;

        switch (view.getId()){
            case R.id.btn_add:
                result = num1 + num2;
                break;
            case R.id.btn_min:
                result = num1 - num2;
                break;
            case R.id.btn_mul:
                result = num1 * num2;
                break;
            case R.id.btn_div:
                result = num1 / num2;
                break;

        }
        String strResult = String.valueOf(result);

        edTxt_result.setText(strResult);
    }
}