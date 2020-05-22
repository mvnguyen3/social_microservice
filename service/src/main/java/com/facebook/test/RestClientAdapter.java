package com.facebook.test;

import org.springframework.web.client.RestTemplate;

public class RestClientAdapter {
    private RestTemplate restTemplate;

    public RestClientAdapter(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public String callApi(Api api){
        String method = api.getApiMethod();
        switch(method){
            case "GET":
                return this.restTemplate.getForObject(api.getApiEndpoint(), String.class);


            default: return null;
        }
    }
}
