package com.facebook.test;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class TestRestTemplate {

    @Autowired
    private RestClientAdapter restClientAdapter;

    public void process() {

        // Adapter design pattern
        String endpoint = "http://dummy.restapiexample.com/api/v1/employees";
//        RestTemplate restTemplate = new RestTemplate();
//        RestClientAdapter restClientAdapter = new RestClientAdapter(restTemplate);
        Api api = new Api();
        api.setApiEndpoint(endpoint);
        api.setApiMethod("GET");

        String response = restClientAdapter.callApi(api);
        System.out.println("Original: " + response);

        Gson gson = new Gson();
        DummyResponse dummyResponse = gson.fromJson(response, DummyResponse.class);
        System.out.println("dummyResponse: " + gson.toJson(dummyResponse));



        // Rest template
//        String response = restTemplate.getForObject(endpoint, String.class);
//        System.out.println("Original: " + response);
//
//        Gson gson = new Gson();
//        DummyResponse dummyResponse = gson.fromJson(response, DummyResponse.class);
//        System.out.println("dummyResponse: " + gson.toJson(dummyResponse));





    }
}
