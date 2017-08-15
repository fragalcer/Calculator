package com.example.franciscogallardo.calculator.My_Package;

import java.text.ParseException;

/**
 * Created by franciscogallardo on 26/4/17.
 */
public abstract class Expression {

    private static int counter = 0;

    Expression() {
        counter++;
    }

    public static int getNumberOfInstances() {
        return counter;
    }

    abstract public String show();

    abstract public int evaluate(Substitute substitute);

    abstract public Variable evaluate();

    abstract public int operators();

    abstract public int size();

    abstract public int height();

    public static Expression add(Expression left, Expression right) {
        return new Add(left, right);
    }

    public static Expression subtract(Expression left, Expression right) {
        return new Subtract(left, right);
    }

    public static Expression multiply(Expression left, Expression right) {
        return new Multiply(left, right);
    }

    public static Expression divide(Expression left, Expression right) {
        return new Divide(left, right);
    }

    public static Expression number(int a) {
        return new Number(a);
    }

    public static Expression variable(String a) {
        return new Variable(a);
    }

    /*
    <exp> ::= <term> | <term> + <exp>
    <term> ::= <factor> | <factor> * <term>
    <factor> ::= <lit> | <var> | ( <exp> )
     */

    public static Expression parseExp(Tokenizer tok) throws ParseException {
        Expression term = parseTerm(tok);
        if (tok.currentIs("+")) {
            tok.next();
            Expression exp = parseExp(tok);
            return new Add(term, exp);
        } else {
            return term;
        }
    }

    private static Expression parseTerm(Tokenizer tok) throws ParseException {
        Expression fact = parseFactor(tok);
        if (tok.currentIs("*")) {
            tok.next();
            Expression term = parseTerm(tok);
            return new Multiply(fact, term);
        } else {
            return fact;
        }
    }

    private static Expression parseFactor(Tokenizer tok) throws ParseException {
        if (tok.current() instanceof Integer) {
            Expression exp = new Number((Integer) tok.current());
            tok.next();
            return exp;
        } else if (tok.currentIs("(")) {
            tok.next();
            Expression exp = parseExp(tok);
            tok.parse(")");
            return exp;
        } else {
            Expression exp = new Variable((String) tok.current());
            tok.next();
            return exp;
        }
    }

}
