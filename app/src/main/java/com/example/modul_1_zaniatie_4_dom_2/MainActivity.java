package com.example.modul_1_zaniatie_4_dom_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator calc = new Calculator();

        calc.turnOn();
        calc.addition(4,2);
        calc.turnOff();
        calc.subtraction(8,5);
        calc.turnOn();
        calc.multiplication(2,5);
        calc.division(9,4);

    }
}