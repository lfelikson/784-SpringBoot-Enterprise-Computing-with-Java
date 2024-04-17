package com.mycompany.controller;

import com.mycompany.data.Customer;
import com.mycompany.data.Customers;
import com.mycompany.data.Data;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import jakarta.annotation.*;

@RestController
public class CustomWebClientController {

    @Resource
    private WebClient webClient;

    @GetMapping("/customers/{id}")
    public Mono<Customer> getCustomer(@PathVariable String id){

       return webClient.get()
                .uri("/users/{id}", id)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(Customer.class);
    }

    @GetMapping("/customers")
    public Mono<String> getCustomers(){


        System.out.println("????????????????????? inside createCustomers ????????????????");

        return webClient.get()
                .uri("/users/")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(String.class);
    }

    @PostMapping("/customers")
    public Mono<String> createCustomer(final Data data){

        System.out.println("+++++++++++++++ inside createCustomer +++++++++++++++++");

        return webClient.post()
                .uri("/users/")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(Mono.just(data), Data.class)
                .retrieve()
                .bodyToMono(String.class);
    }

}