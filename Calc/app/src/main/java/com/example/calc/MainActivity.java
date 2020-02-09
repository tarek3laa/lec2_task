package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button buttonPlus, buttonMinus, buttonMultiply, buttonDivision, buttonEqu;
    private int res = 0;
    private boolean plus, minus, multiply, division;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.edit_text);
        buttonPlus = findViewById(R.id.btn_plus);
        buttonMinus = findViewById(R.id.btn_minus);
        buttonMultiply = findViewById(R.id.btn_mult);
        buttonDivision = findViewById(R.id.btn_div);
        buttonEqu = findViewById(R.id.btn_equ);

        buttonEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int x = Integer.parseInt(editText.getText().toString());

                if (plus)
                    res += x;
                else if (minus)
                    res -= x;
                else if (multiply)
                    res *= x;
                else if (division)
                    res = (x != 0) ? res / x : 0;

                editText.setText("" + res);
                res = 0;

            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                division = false;
                multiply = false;
                minus = false;


                plus = true;
                res += Integer.parseInt(editText.getText().toString());
                editText.setText("");

            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division = false;
                multiply = false;
                plus = false;

                int x = Integer.parseInt(editText.getText().toString());

                minus = true;

                if (res != 0)
                    res -= x;
                else
                    res = x;

                editText.setText("");

            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                division = false;
                minus = false;
                plus = false;


                multiply = true;
                int x = Integer.parseInt(editText.getText().toString());

                if (res != 0)
                    res *= x;
                else
                    res = x;
                editText.setText("");
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                minus = false;
                plus = false;
                multiply = false;

                division = true;
                int x = Integer.parseInt(editText.getText().toString());

                if (res != 0 && x != 0)
                    res /= x;
                else
                    res = x;
                editText.setText("");
            }
        });

    }
}
