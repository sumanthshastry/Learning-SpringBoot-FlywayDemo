package com.shastry.flyway.demo.FlywayDemo.controller;

import com.shastry.flyway.demo.FlywayDemo.model.Customer;
import com.shastry.flyway.demo.FlywayDemo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/{customerId}")
    public Customer get(@PathVariable Integer customerId) {
        return customerService.get(customerId);
    }

    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAllCustomers();
    }
}
