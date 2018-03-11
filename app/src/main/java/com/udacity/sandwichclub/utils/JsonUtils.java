package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonUtils {

    public static Sandwich parseSandwichJson(String json) {

        Sandwich sandwich = null;
        try {

            sandwich = new Sandwich();
            JSONObject sandwhichJson = new JSONObject(json);
            sandwich.setDescription(sandwhichJson.optString("description","N/A"));
            sandwich.setPlaceOfOrigin(sandwhichJson.optString("placeOfOrigin","N/A"));
            JSONObject nameObject = (JSONObject)sandwhichJson.get("name");
            sandwich.setMainName(nameObject.optString("mainName","N/A"));
            sandwich.setAlsoKnownAs(extractList((JSONArray)nameObject.get("alsoKnownAs")));
            sandwich.setImage(sandwhichJson.optString("image","N/A"));
            sandwich.setIngredients(extractList((JSONArray)sandwhichJson.get("ingredients")));
        } catch (JSONException e) {
            e.printStackTrace();
            // User cannot recover from this error. Suppress and return null sandwhich
        }

        return sandwich;
    }

    private static List<String> extractList(JSONArray jsonArray) throws JSONException {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            arrayList.add(jsonArray.getString(i));
        }
        return arrayList;
    }
}
