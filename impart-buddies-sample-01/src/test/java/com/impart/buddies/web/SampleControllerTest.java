// File: UserControllerTest.java
package com.impart.buddies.web;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.impart.buddies.web.controller.SampleController;
import com.impart.buddies.web.service.SampleService;

@WebMvcTest(SampleController.class)
class SampleControllerTest {

	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private SampleService sampleService;

    @Test
    void shouldReturnUserWhenIdIsValid() throws Exception {
        when(sampleService.getSampleById(1L)).thenReturn("Abrar Alam");
        mockMvc.perform(get("/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Abrar Alam"));
    }
}
