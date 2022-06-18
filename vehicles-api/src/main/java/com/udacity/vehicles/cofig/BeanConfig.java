package com.udacity.vehicles.cofig;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }

    @Bean
    @LoadBalanced
    public WebClient webClient() {
        return WebClient.create();
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public OpenAPI vehiclesAPI() {
        return new OpenAPI()
                .info(new Info().title("Vehicles API")
                        .description("A REST API to maintain vehicle data and provide a complete view of vehicle details (including price and address).")
                        .version("v0.0.1"));
    }
}
