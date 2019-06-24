package com.school.ui.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.school.ui.constant.UIConstant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TranslateResponse
{
    @JsonProperty(UIConstant.LABEL)
    private String label;
}
