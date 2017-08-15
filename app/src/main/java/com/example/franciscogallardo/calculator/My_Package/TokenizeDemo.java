package com.example.franciscogallardo.calculator.My_Package;

/**
 * Created by franciscogallardo on 10/5/17.
 */

public class TokenizeDemo {

    private static String e1 = "2 * 4 + 2";
    private static String e2 = "(2 * 44) + 2";

    public static void main(String[] args) {
        Tokenizer t = new MySimpleTokenizer(e2);
        while (t.hasNext()) {
            System.out.println(" " + t.current());
            t.next();
        }
    }

}
