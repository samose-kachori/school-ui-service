package com.school.ui.controller;

import com.school.ui.constant.MockConstant;
import com.school.ui.rest.service.UIService;
import com.school.ui.util.ExpectedUtil;
import com.school.ui.util.MockUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UIController.class)
public class UIControllerTest
{
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UIService uiService;

    @Test
    public void testTranslate() throws Exception
    {
        List<String> mockList = MockUtil.getMockList();

        Mockito.when(uiService.translate(Mockito.anyString()))
                .thenReturn(mockList);

        MockHttpServletResponse response = mockMvc.perform(get("/ui/translate/"+MockConstant.MOCK_VALUE)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn().getResponse();

        JSONAssert.assertEquals(ExpectedUtil.getExpectedList().toString(), response.getContentAsString(), true);

    }
}
