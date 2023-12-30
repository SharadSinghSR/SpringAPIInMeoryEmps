package com.example.employeeapi.empapi.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeapi.empapi.model.Employee;
import com.example.employeeapi.empapi.repository.EmpRepository;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmpRepository empRepository;

    @GetMapping("/employee")
    // return employee data
    public List<Employee> getEmployees() {
        Collection<Employee> employees = empRepository.getEmpRepo().values();
        return new ArrayList<>(employees);
    }

}
