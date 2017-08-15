package com.example.franciscogallardo.calculator.My_Package;

/**
 * Created by franciscogallardo on 26/4/17.
 */
public class Add extends Expression {
    private Expression left, right;

    public Add(Expression l, Expression r) {
        left = l;
        right = r;
    }

    @Override
    public String show() {
        return "(" + left.show() + " + " + right.show() + ")";
    }

    @Override
    public int evaluate(Substitute substitute) {
        return left.evaluate(substitute) + right.evaluate(substitute);
    }

    @Override
    public Variable evaluate() {

        if (left instanceof Number && right instanceof Number) {
            return new Variable( "" + ((((Number) left).getValue()) + (((Number) right).getValue())));
        }
        else if (left instanceof Variable) {
            return new Variable("(" + left.show() + " + " + right.evaluate() + ")");

        }
        else if (right instanceof Variable) {
            return new Variable("(" + left.evaluate() + " + " + right.show() + ")");
        }
        return new Variable ("" + left.evaluate() + right.evaluate());
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
