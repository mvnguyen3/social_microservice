package com.facebook.test;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DummyResponse {
    private String status;
    private List<Employee> data;
}
