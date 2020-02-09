package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button cBtn, divBtn, mulBtn, sevenBtn, eightBtn, nineBtn, nigBtn, fourBtn, fiveBtn, sixBtn,
            plusBtn, oneBtn, twoBtn, threeBtn, eqBtn, perBtn, zeroBtn, dotBtn;
    private ImageView removeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        cBtn = findViewById(R.id.c_btn);
        divBtn = findViewById(R.id.div_btn);
        mulBtn = findViewById(R.id.mul_btn);
        removeBtn = findViewById(R.id.clr_btn);
        sevenBtn = findViewById(R.id.seven_btn);
        eightBtn = findViewById(R.id.eight_btn);
        nineBtn = findViewById(R.id.nine_btn);
        nigBtn = findViewById(R.id.nig_btn);
        fourBtn = findViewById(R.id.four_btn);
        fiveBtn = findViewById(R.id.five_btn);
        sixBtn = findViewById(R.id.six_btn);
        plusBtn = findViewById(R.id.plus_btn);
        oneBtn = findViewById(R.id.one_btn);
        twoBtn = findViewById(R.id.two_btn);
        threeBtn = findViewById(R.id.three_btn);
        eqBtn = findViewById(R.id.eq_btn);
        perBtn = findViewById(R.id.percent_btn);
        zeroBtn = findViewById(R.id.zero_btn);
        dotBtn = findViewById(R.id.dot_btn);

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "1");
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "2");
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "3");
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "4");
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "5");
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "6");
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "7");
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "8");
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "9");
            }
        });
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "+");
            }
        });
        nigBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "-");
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "÷");

            }
        });
        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "×");
            }
        });


        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = textView.getText().toString();
                if (num != null && num.length() != 0)
                    num = num.substring(0, num.length() - 1);
                textView.setText(num);
            }
        });


        perBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "%");
            }
        });
        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + ".");
            }
        });
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "0");
            }
        });
        eqBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    String str = textView.getText().toString();
                    if (str.contains("×"))
                        str = str.replaceAll("×", "*");
                    if (str.contains("÷"))
                        str = str.replaceAll("÷", "/");
                    Expression expression = new ExpressionBuilder(str).build();
                    textView.setText(expression.evaluate() + "");

                } catch (Exception e) {
                    textView.setText("ERROR");
                }
            }
        });
    }

}
