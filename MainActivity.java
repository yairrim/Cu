package com.example.customer.testapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int i = 0;
        Button B1 = (Button) findViewById(R.id.a1);
        final String[] num1 = {""};
        final String[] num2 = {""};
        final boolean[] isActoin = {false};
        final int[] numNum = {1};
        final TextView anser = (TextView) findViewById(R.id.anseView);
        final double finalanser =0;

        Button B2 = (Button) findViewById(R.id.a2);

        Button B3 = (Button) findViewById(R.id.a3);
        Button B4 = (Button) findViewById(R.id.a4);
        Button B5 = (Button) findViewById(R.id.a5);
        Button B6 = (Button) findViewById(R.id.a6);
        Button B7 = (Button) findViewById(R.id.a7);
        Button B8 = (Button) findViewById(R.id.a8);
        Button B9 = (Button) findViewById(R.id.a9);
        Button BMu = (Button) findViewById(R.id.multiplay);
        Button BMi = (Button) findViewById(R.id.minus);
        Button BA = (Button) findViewById(R.id.ans);
        Button BD = (Button) findViewById(R.id.Divaid);
        Button BP = (Button) findViewById(R.id.plus);
        Button Bc = (Button) findViewById(R.id.clear);

        Bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isActoin[0]) {
                    num1[i] = "";
                    num1[i] = num1[i] + "";
                    anser.setText(num1[i]);
                }
                if(isActoin[0]) {
                    num2[i] = "";
                    num2[i] = num2[i] + "";
                    anser.setText(num2[i]);
                }
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isActoin[0]) {
                    num1[i] = num1[i] + "1";
                    anser.setText(num1[i]);
                }
                if(isActoin[0]) {
                    num2[i] = num2[i] + "1";
                    anser.setText(num1[i]);
                }

            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isActoin[0]) {
                    num1[i] = num1[i] + "2";
                    anser.setText(num1[i]);
                }
                if(isActoin[0]) {
                    num2[i] = num2[i] + "2";
                    anser.setText(num1[i]);
                }

            }
        });       
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isActoin[0]) {
                    num1[i] = num1[i] + "3";
                    anser.setText(num1[i]);
                }
                if(isActoin[0]) {
                    num2[i] = num2[i] + "3";
                    anser.setText(num1[i]);
                }
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isActoin[0]) {
                    num1[i] = num1[i] + "4";
                    anser.setText(num1[i]);
                }
                if(isActoin[0]) {
                    num2[i] = num2[i] + "4";
                    anser.setText(num1[i]);
                }
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isActoin[0]) {
                    num1[i] = num1[i] + "5";
                    anser.setText(num1[i]);
                }
                if(isActoin[0]) {
                    num2[i] = num2[i] + "5";
                    anser.setText(num1[i]);
                }
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!isActoin[0]) {
                    num1[i] = num1[i] + "6";
                    anser.setText(num1[i]);
                }
                if(isActoin[0]) {
                    num2[i] = num2[i] + "6";
                    anser.setText(num1[i]);
                }
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isActoin[0]) {
                    num1[i] = num1[i] + "7";
                    anser.setText(num1[i]);
                }
                if(isActoin[0]) {
                    num2[i] = num2[i] + "7";
                    anser.setText(num1[i]);
                }
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isActoin[0]) {
                    num1[i] = num1[i] + "8";
                    anser.setText(num1[i]);
                }
                if(isActoin[0]) {
                    num2[i] = num2[i] + "8";
                    anser.setText(num1[i]);
                }
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isActoin[0]) {
                    num1[i] = num1[i] + "9";
                    anser.setText(num1[i]);
                }
                if(isActoin[0]) {
                    num2[i] = num2[i] + "9";
                    anser.setText(num1[i]);
                }
            }
        });
        BMu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1[i] = num1[i] +"X";
                anser.setText(num1[i]);
                if(isActoin[0]) {
                    isActoin[0]=false;
                    double Dnum1 =Double.parseDouble(num1[0]);
                    double Dnum2 =Double.parseDouble(num2[0]);
                    num1[0]=Double.toString(Dnum1*Dnum2);
                    num2[0]="";

                }
                else {
                    isActoin[0]=true;
                }
            }
        });
        BMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1[i] = num1[i] +"-";
                anser.setText(num1[i]);
                if(isActoin[0]) {
                    isActoin[0]=false;
                    double Dnum1 =Double.parseDouble(num1[0]);
                    double Dnum2 =Double.parseDouble(num2[0]);
                    num1[0]=Double.toString(Dnum1-Dnum2);
                    num2[0]="";

                }
                else {
                    isActoin[0]=true;
                }
            }
        });
        BP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1[i] = num1[i] +"+";
                anser.setText(num1[i]);
                if(isActoin[0]) {
                    isActoin[0]=false;
                    double Dnum1 =Double.parseDouble(num1[0]);
                    double Dnum2 =Double.parseDouble(num2[0]);
                    num1[0]=Double.toString(Dnum1+Dnum2);
                    num2[0]="";

                }
                else {
                    isActoin[0]=true;
                }
            }
        });
        BD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1[i] = num1[i] +":";
                anser.setText(num1[i]);
                if(isActoin[0]) {
                    isActoin[0]=false;
                    double Dnum1 =Double.parseDouble(num1[0]);
                    double Dnum2 =Double.parseDouble(num2[0]);
                    num1[0]=Double.toString(Dnum1/Dnum2);
                    num2[0]="";

                }
                else {
                    isActoin[0]=true;
                }
            }
        });
        BA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });



    }
    /*
    public void numAdd(String ToAdd){
        num1=num1+ToAdd;
        anser.setText(num1);
    }
    */
}
