package com.example.franciscogallardo.calculator.My_Package;

/**
 * Created by franciscogallardo on 26/4/17.
 */
public class Number extends Expression {

    private int value;


    Number(int v) {
        value = v;
    }

    @Override
    public String show() {
        return "" + value;
    }

    @Override
    public int evaluate(Substitute substitute) {
        return value;
    }

    @Override
    public Variable evaluate() {
        return null;
    }

    @Override
    public int operators() {
        return 0;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public int height() {
        return 0;
    }

    int getValue(){
        return value;
    }

}
