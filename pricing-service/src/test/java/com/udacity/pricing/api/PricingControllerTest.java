package com.udacity.pricing.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.util.UriComponentsBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PricingControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGet() throws Exception {
        mvc.perform(get(UriComponentsBuilder
                        .fromPath("/prices/search/findByVehicleId")
                        .queryParam("vehicleId", 1)
                        .build()
                        .toUri()))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(new MediaType("application", "*+json")));
    }
}
