package com.facebook.test;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@NoArgsConstructor
public class Api {
    private String apiEndpoint;
    private String apiMethod;  // GET, POST
    private HashMap<String ,String> apiRequestParameter;
    private HashMap<String ,String> apiHeader;
    private String apiRequestBody;

}
