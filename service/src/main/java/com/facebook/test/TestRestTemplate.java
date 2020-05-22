package com.facebook.test;

import com.google.gson.Gson;
import org.springframework.web.client.RestTemplate;

public class TestRestTemplate {

    public static void main(String[] args) {
        String api = "http://dummy.restapiexample.com/api/v1/employees";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(api, String.class);
        System.out.println("Original: " + response);

        Gson gson = new Gson();
        DummyResponse dummyResponse = gson.fromJson(response, DummyResponse.class);
        System.out.println("dummyResponse: " + gson.toJson(dummyResponse));


    }
}
