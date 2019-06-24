package com.school.ui.util;

import org.json.JSONArray;

public class ExpectedUtil
{
    public JSONArray getExpectedList()
    {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put("abc");
        jsonArray.put("def");

        return jsonArray;
    }
}
