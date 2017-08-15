package com.example.franciscogallardo.calculator.My_Package;

/**
 * Created by franciscogallardo on 26/4/17.
 */
public class Variable extends Expression {

    private String literal;

    Variable(String l) {
        literal = l;
    }

    @Override
    public String show() {
        return "" + literal;
    }

    @Override
    public int evaluate(Substitute substitute) {
        return substitute.get(literal);
    }

    @Override
    public Variable evaluate() {
        return new Variable(literal);
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

    @Override
    public String toString() {
        return literal;
    }
}
