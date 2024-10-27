package com.shastry.flyway.demo.FlywayDemo.service;

import com.shastry.flyway.demo.FlywayDemo.model.Customer;
import com.shastry.flyway.demo.FlywayDemo.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo customerRepo;

    public Customer get(Integer id) {
        return customerRepo.findById(id).orElse(null);
    }

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }
}
