package com.example.franciscogallardo.calculator.My_Package;

import java.text.ParseException;

/**
 * Created by franciscogallardo on 10/5/17.
 */
public class ParseDemo {

    private static String e1 = "2 * 14 +2";
    private static String e2 = "(2 * 44) + 2";

    public static void main(String[] args) throws ParseException {
        Tokenizer t = new MySimpleTokenizer(e1);
        Expression pe = Expression.parseExp(t);
        Substitute substitute = new Substitute();
        System.out.println(pe.show() + " = " + pe.evaluate(substitute));
    }

}
