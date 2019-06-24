package com.school.ui.rest.service;


import com.school.ui.constant.MockConstant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
public class UIServiceImplTest
{
    @TestConfiguration
    static class UIServiceImplTestContextConfiguration {

        @Bean
        public UIService uiService()
        {
            return new UIServiceImpl();
        }
    }

    @Autowired
    UIService uiService;


    @Test
    public void testTranslate()
    {
        List<String> list = this.uiService.translate(MockConstant.MOCK_VALUE);
        assertNotNull(list);
    }
}
