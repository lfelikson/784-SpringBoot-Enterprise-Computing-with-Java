package com.mycompany.client;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
public class RestClientDemo {
  
    final static String ROOT_URI = "http://localhost:8080/JSONmodelAndViewDemo";

    public static void main(String[] args) {

      RestTemplate restTemplate = new RestTemplate();
    //  ResponseEntity<String> response = restTemplate.getForEntity(ROOT_URI, String.class);
      ResponseEntity<String> response = restTemplate.getForEntity(args[0], String.class);
      System.out.println("Response is "+response.getBody());
  
    }
  
  }