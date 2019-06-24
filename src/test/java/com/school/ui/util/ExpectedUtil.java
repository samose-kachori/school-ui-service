package com.school.ui.util;

import com.school.ui.constant.UIConstant;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ExpectedUtil
{
    public static JSONArray getExpectedList() throws JSONException
    {
        JSONArray jsonArray = new JSONArray();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put(UIConstant.LABEL, "abc");
        jsonArray.put(jsonObject);

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put(UIConstant.LABEL, "def");
        jsonArray.put(jsonObject1);

        return jsonArray;
    }
}
