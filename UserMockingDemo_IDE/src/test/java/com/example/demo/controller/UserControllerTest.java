package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Step 1: Register a mocked UserService in the Spring test context.
    @MockBean
    private UserService userService;

    @Test
    void testGetUsers() throws Exception {
        // Step 2: Define the mock service response.
        when(userService.getUsers()).thenReturn("List of Users");

        // Step 3: Call the controller and verify HTTP 200 + response body.
        mockMvc.perform(get("/users"))
                .andExpect(status().isOk())
                .andExpect(content().string("List of Users"));
    }
}
