package com.example.franciscogallardo.calculator;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by franciscogallardo on 31/3/17.
 */
public class JsonUtil {

    private JSONObject jsonObj = new JSONObject();

    String toJSon(MainActivity mainActivity) {
        try {
            this.jsonObj.put("number", mainActivity.getDisplay()); // Set the first name/pair
            return jsonObj.toString();
        } catch (JSONException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    String load() {
        try {
            return jsonObj.getString("number");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "Hello";
    }
}
