package com.test.errormanagement.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.test.errormanagement.constant.UrlConstant;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {
    private MockMvc mockMvc;

    @Test
    void getUserSuccessTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(UrlConstant.USER_URL)).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
