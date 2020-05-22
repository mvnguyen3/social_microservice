package com.facebook.test;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
    private String id;
    private String employee_name;
    private String employee_salary;
    private String employee_age;
    private String profile_image;
}
