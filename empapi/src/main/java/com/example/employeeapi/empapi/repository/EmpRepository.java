package com.example.employeeapi.empapi.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.employeeapi.empapi.model.Employee;

@Repository
public class EmpRepository {
    // hashmap for employees
    // add 5 employees

    public static HashMap<Integer, Employee> empRepo = new HashMap<>();

    static {
        empRepo.put(1, new Employee(1, "John", "IT", 10000, 5));
        empRepo.put(2, new Employee(2, "Mary", "HR", 20000, 10));
        empRepo.put(3, new Employee(3, "Peter", "IT", 30000, 15));
        empRepo.put(4, new Employee(4, "David", "HR", 40000, 20));
        empRepo.put(5, new Employee(5, "Paul", "IT", 50000, 25));
    }

    public Map<Integer, Employee> getEmpRepo() {
        return empRepo;
    }

}
