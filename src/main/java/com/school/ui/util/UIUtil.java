package com.school.ui.util;

import com.school.ui.model.TranslateResponse;

import java.util.ArrayList;
import java.util.List;

public class UIUtil
{
    public static List<TranslateResponse> getTranslateResponseList(List<String> list)
    {
        List<TranslateResponse> translateResponseList = new ArrayList<>();
        for(String value : list)
        {
            TranslateResponse translateResponse = new TranslateResponse();
            translateResponse.setLabel(value);
            translateResponseList.add(translateResponse);
        }

        return translateResponseList;
    }
}
