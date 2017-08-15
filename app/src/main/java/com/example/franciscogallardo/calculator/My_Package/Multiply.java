package com.example.franciscogallardo.calculator.My_Package;

/**
 * Created by franciscogallardo on 26/4/17.
 */
public class Multiply extends Expression {

    private Expression left, right;

    Multiply(Expression l, Expression r) {
        left = l;
        right = r;
    }

    @Override
    public String show() {
        return "(" + left.show() + " * " + right.show() + ")";
    }

    @Override
    public int evaluate(Substitute substitute) {
        return left.evaluate(substitute) * right.evaluate(substitute);
    }

    @Override
    public Variable evaluate() {
        if (left instanceof Variable) {
            return new Variable("(" + left.show() + " + " + right.evaluate() + ")");
        }
        else
            return new Variable("(" + left.evaluate() + " + " + right.show() + ")");
    }

    @Override
    public int operators() {
        int sum = 1;
        return sum + left.operators() + right.operators();
    }

    @Override
    public int size() {
        int sum = 1;
        return sum + left.size() + right.size();
    }

    @Override
    public int height() {
        return Math.max(left.height() + 1, right.height() + 1);
    }

}
