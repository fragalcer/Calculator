package com.example.franciscogallardo.calculator.My_Package;

import java.text.ParseException;

/**
 * Created by franciscogallardo on 10/5/17.
 */
public abstract class Tokenizer {

    abstract boolean hasNext();
    abstract Object current();
    abstract void next();


    void parse(Object o) throws ParseException {
        if (current() == null || !current().equals(o)) throw new ParseException(".", 9);
        next();
    }

    boolean currentIs(Object v) {
        return (current() != null && current().equals(v));
    }

}
