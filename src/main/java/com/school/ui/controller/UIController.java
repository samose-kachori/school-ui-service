package com.school.ui.controller;

import com.school.ui.rest.service.UIService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ui")
public class UIController
{
    @Autowired
    UIService uiService;

    @GetMapping("/translate/{value}")
    public List<String> translate(@PathVariable("value") String value)
    {
        return this.uiService.translate(value);
    }
}
