package com.shastry.flyway.demo.FlywayDemo.service;

import com.shastry.flyway.demo.FlywayDemo.model.Employee;
import com.shastry.flyway.demo.FlywayDemo.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public Employee getEmployee(Integer id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
}
