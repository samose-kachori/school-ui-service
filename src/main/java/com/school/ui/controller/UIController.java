package com.school.ui.controller;

import com.school.ui.model.TranslateResponse;
import com.school.ui.rest.service.UIService;
import com.school.ui.util.UIUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ui")
public class UIController
{
    @Autowired
    UIService uiService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/translate/{value}")
    public List<TranslateResponse> translate(@PathVariable("value") String value)
    {
        List<String> list =  this.uiService.translate(value);
        return UIUtil.getTranslateResponseList(list);
    }
}
