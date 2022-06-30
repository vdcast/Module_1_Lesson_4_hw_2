package com.example.modul_1_zaniatie_4_dom_2;

import android.util.Log;

public class Calculator {

    public String calcStatus = "OFF";
    public int result;

    // Addition
    public int addition(int a, int b){
        if (calcStatus.equals("ON")){
            result = a + b;
            Log.d("MYLOG", a + " + " + b + " = " + result);
        } else {
            Log.d("MYLOG", "Please, turn on calculator. Hint: use method .turnOn()");
        }
        return result;
    }
    // Subtraction
    public int subtraction(int a, int b){
        if (calcStatus.equals("ON")){
            result = a - b;
            Log.d("MYLOG",  a + " - " + b + " = " + result);
        } else {
            Log.d("MYLOG", "Please, turn on calculator. Hint: use method .turnOn()");
        }
        return result;
    }
    // Multiplication
    public int multiplication(int a, int b){
        if (calcStatus.equals("ON")){
            result = a * b;
            Log.d("MYLOG",  a + " * " + b + " = " + result);
        } else {
            Log.d("MYLOG", "Please, turn on calculator. Hint: use method .turnOn()");
        }
        return result;
    }
    // Division
    public double division(int a, int b){
        if (calcStatus.equals("ON")){
            double a1 = a;
            double b1 = b;
            double result = a1 / b1;
            Log.d("MYLOG", "You've tried to divide int number. I've changed type from int to double. Enjoy result.");
            Log.d("MYLOG",  a + " / " + b + " = " + result);
        } else {
            Log.d("MYLOG", "Please, turn on calculator. Hint: use method .turnOn()");
        }
        return result;
    }

    public void turnOn(){
        calcStatus = "ON";
        Log.d("MYLOG", "Calculator turned on. You can use it!");
    }



    public void turnOff(){
        calcStatus = "OFF";
        Log.d("MYLOG", "Calculator turned off. You can't use it.");
    }







    //multiplication
    //division
    //addition
    //subtraction
}
