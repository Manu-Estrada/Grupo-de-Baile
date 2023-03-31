package com.baile.grupodebaile.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(value = RolleController.class)
public class RolleControllerTest {
    
    @Autowired
    MockMvc mockMvc;

    @MockBean
    RolleService service;

    @Autowired
    ObjectMapper mapper;

}
