package com.example.addtwonums_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edTxt_num1 = findViewById(R.id.edTxt_num1);
        EditText edTxt_num2 = findViewById(R.id.edTxt_num2);
        EditText edTxt_result = findViewById(R.id.edTxt_result);
        Button btn_add = findViewById(R.id.btn_add);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNum1 = edTxt_num1.getText().toString();
                String strNum2 = edTxt_num2.getText().toString();

                double num1 = Double.valueOf(strNum1);
                double num2 = Double.valueOf(strNum2);

                double result = num1 + num2;

                String strResult = String.valueOf(result);

                edTxt_result.setText(strResult);
            }
        });
    }
}