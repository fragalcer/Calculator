package com.example.franciscogallardo.calculator.My_Package;

/**
 * Created by franciscogallardo on 10/5/17.
 */
public class MySimpleTokenizer extends Tokenizer {

    private String text;
    private int pos;
    private Object current;

    private static final char whitespace[] = {' ', '\n', '\t'};
    private static final char symbol[] = {'(', ')', ':', '?', ',', '*', '+', '-', '/', 'x'};

    public MySimpleTokenizer(String text) {

        this.text = text;
        this.pos = 0;
        next();
    }

    boolean hasNext() {
        return current != null;
    }

    Object current() {
        return current;
    }

    public void next() {
        consumeWhite();
        if (pos == text.length()) {
            current = null;
        } else if (isIn(text.charAt(pos), symbol)) {
            current = "" + text.charAt(pos);
            pos++;
        } else if (Character.isDigit(text.charAt(pos))) {
            int start = pos;
            while (pos < text.length() && Character.isDigit(text.charAt(pos)))
                pos++;
            if (pos + 1 < text.length() && text.charAt(pos) == '.' &&
                    Character.isDigit(text.charAt(pos + 1))) {
                pos++;
                while (pos < text.length() && Character.isDigit(text.charAt(pos)))
                    pos++;
                current = Double.parseDouble(text.substring(start, pos));
            } else {
                current = Integer.parseInt(text.substring(start, pos));
            }

        } else {
            int start = pos;
            while (pos < text.length() && !isIn(text.charAt(pos), symbol)
                    && !isIn(text.charAt(pos), whitespace))
                pos++;
            current = text.substring(start, pos);
        }
    }

    private void consumeWhite() {
        while (pos < text.length() && isIn(text.charAt(pos), whitespace))
            pos++;
    }

    private boolean isIn(char c, char charlist[]) {
        for (char w : charlist) {
            if (w == c) {
                return true;
            }
        }
        return false;
    }

}
