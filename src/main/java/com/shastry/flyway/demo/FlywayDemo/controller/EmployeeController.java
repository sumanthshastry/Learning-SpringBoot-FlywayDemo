package com.shastry.flyway.demo.FlywayDemo.controller;

import com.shastry.flyway.demo.FlywayDemo.model.Employee;
import com.shastry.flyway.demo.FlywayDemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<Employee> list() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{employeeId}")
    public Employee get(@PathVariable Integer employeeId) {
        return employeeService.getEmployee(employeeId);
    }

}
