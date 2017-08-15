package com.example.franciscogallardo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.franciscogallardo.calculator.My_Package.Expression;
import com.example.franciscogallardo.calculator.My_Package.MySimpleTokenizer;
import com.example.franciscogallardo.calculator.My_Package.Substitute;
import com.example.franciscogallardo.calculator.My_Package.Tokenizer;
import org.json.JSONException;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity {

    JsonUtil JS = new JsonUtil();

    public String getDisplay() {
        return this.display;
    }

    String display = "";
    String display_x ="";
    boolean display_x_pressed = false;
    Substitute substitute = new Substitute();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOne(View v) {
        if (display_x_pressed) {
            String display = this.display_x + "1";
            int displayValue = Integer.parseInt(display);
            substitute.put("x", displayValue);
            TextView tv = (TextView) findViewById(R.id.display_x);
            tv.setText((display));
            this.display_x = display;
        } else {
            String display = this.display + "1";
            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText((display));
            this.display = display;
        }
    }

    public void buttonTwo(View v) {
        if (display_x_pressed) {
            String display = this.display_x + "2";
            int displayValue = Integer.parseInt(display);
            substitute.put("x", displayValue);
            TextView tv = (TextView) findViewById(R.id.display_x);
            tv.setText((display));
            this.display_x = display;
        } else {
            String display = this.display + "2";
            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText((display));
            this.display = display;
        }
    }

    public void buttonThree(View v) {
        if (display_x_pressed) {
            String display = this.display_x + "3";
            int displayValue = Integer.parseInt(display);
            substitute.put("x", displayValue);
            TextView tv = (TextView) findViewById(R.id.display_x);
            tv.setText((display));
            this.display_x = display;
        } else {
            String display = this.display + "3";
            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText((display));
            this.display = display;
        }
    }

    public void buttonFour(View v) {
        if (display_x_pressed) {
            String display = this.display_x + "4";
            int displayValue = Integer.parseInt(display);
            substitute.put("x", displayValue);
            TextView tv = (TextView) findViewById(R.id.display_x);
            tv.setText((display));
            this.display_x = display;
        } else {
            String display = this.display + "4";
            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText((display));
            this.display = display;
        }
    }

    public void buttonFive(View v) {
        if (display_x_pressed) {
            String display = this.display_x + "5";
            int displayValue = Integer.parseInt(display);
            substitute.put("x", displayValue);
            TextView tv = (TextView) findViewById(R.id.display_x);
            tv.setText((display));
            this.display_x = display;
        } else {
            String display = this.display + "5";
            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText((display));
            this.display = display;
        }
    }

    public void buttonSix(View v) {
        if (display_x_pressed) {
            String display = this.display_x + "6";
            int displayValue = Integer.parseInt(display);
            substitute.put("x", displayValue);
            TextView tv = (TextView) findViewById(R.id.display_x);
            tv.setText((display));
            this.display_x = display;
        } else {
            String display = this.display + "6";
            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText((display));
            this.display = display;
        }
    }

    public void buttonSeven(View v) {
        if (display_x_pressed) {
            String display = this.display_x + "7";
            int displayValue = Integer.parseInt(display);
            substitute.put("x", displayValue);
            TextView tv = (TextView) findViewById(R.id.display_x);
            tv.setText((display));
            this.display_x = display;
        } else {
            String display = this.display + "7";
            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText((display));
            this.display = display;
        }
    }

    public void buttonEight(View v) {
        if (display_x_pressed) {
            String display = this.display_x + "8";
            int displayValue = Integer.parseInt(display);
            substitute.put("x", displayValue);
            TextView tv = (TextView) findViewById(R.id.display_x);
            tv.setText((display));
            this.display_x = display;
        } else {
            String display = this.display + "8";
            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText((display));
            this.display = display;
        }
    }

    public void buttonNine(View v) {
        if (display_x_pressed) {
            String display = this.display_x + "9";
            int displayValue = Integer.parseInt(display);
            substitute.put("x", displayValue);
            TextView tv = (TextView) findViewById(R.id.display_x);
            tv.setText((display));
            this.display_x = display;
        } else {
            String display = this.display + "9";
            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText((display));
            this.display = display;
        }
    }

    public void buttonZero(View v) {
        if (display_x_pressed) {
            String display = this.display_x + "0";
            int displayValue = Integer.parseInt(display);
            substitute.put("x", displayValue);
            TextView tv = (TextView) findViewById(R.id.display_x);
            tv.setText((display));
            this.display_x = display;
        } else {
            String display = this.display + "0";
            TextView tv = (TextView) findViewById(R.id.display);
            tv.setText((display));
            this.display = display;
        }
    }

    public void buttonLeftParenthesis(View v) {
        String display = this.display + "(";
        TextView tv = (TextView)findViewById(R.id.display);
        tv.setText((display));
        this.display = display;
    }

    public void buttonRightParenthesis(View v) {
        String display = this.display + ")";
        TextView tv = (TextView)findViewById(R.id.display);
        tv.setText((display));
        this.display = display;
    }

    public void buttonAllClear(View v) {
        this.display = "0";
        String textDisplay = String.valueOf(display);
        TextView tv = (TextView)findViewById(R.id.display);
        tv.setText((textDisplay));
    }

    public void buttonDelete(View v) {
        String display = this.display.substring(0,this.display.length()-1);
        TextView tv = (TextView)findViewById(R.id.display);
        tv.setText((display));
        this.display = display;
    }

    public void buttonSave(View v) {
        JS.toJSon(this);
    }

    public void buttonLoad(View v) throws JSONException {

        String number;

        number = JS.load();
        TextView tv = (TextView)findViewById(R.id.display);
        tv.setText((number));
        this.display = number;
    }

    public void buttonEquals(View v) throws ParseException {
        Tokenizer t = new MySimpleTokenizer(this.display);
        Expression pe = Expression.parseExp(t);
        String display = String.valueOf(pe.evaluate(substitute));
        TextView tv = (TextView)findViewById(R.id.display);
        tv.setText((display));
        this.display = display;
    }

    public void buttonMultiplied(View v) {
        String display = this.display + "*";
        TextView tv = (TextView)findViewById(R.id.display);
        tv.setText((display));
        this.display = display;
    }

    public void buttonDivided(View v) {
        String display = this.display + "/";
        TextView tv = (TextView)findViewById(R.id.display);
        tv.setText((display));
        this.display = display;
    }

    public void buttonPlus(View v) {
        String display = this.display + "+";
        TextView tv = (TextView)findViewById(R.id.display);
        tv.setText((display));
        this.display = display;
    }

    public void buttonMinus(View v) {
        String display = this.display + "-";
        TextView tv = (TextView)findViewById(R.id.display);
        tv.setText((display));
        this.display = display;
    }

    public void buttonX(View v) {
        String display = this.display + "x";
        TextView tv = (TextView)findViewById(R.id.display);
        tv.setText((display));
        this.display = display;
    }

    public void buttonSetX(View v) {
        if (!display_x_pressed) {
            display_x_pressed = true;
        } else {
            display_x_pressed = false;
        }
    }

}
