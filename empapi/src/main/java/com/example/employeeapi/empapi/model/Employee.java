package com.example.employeeapi.empapi.model;

// create entity class Employee
// with id, name, department, salary, experience
// use lombok to generate getter, setter, constructor, toString

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String department;
    private int salary;
    private int experience;
}
