package com.school.ui.rest.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UIServiceImpl implements UIService
{
    @Override
    public List<String> translate(String value)
    {
        List<String> list = new ArrayList<>();
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        for(int i=0;i<10;i++) {
            String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
            list.add(generatedString);
        }

        return list;
    }
}
