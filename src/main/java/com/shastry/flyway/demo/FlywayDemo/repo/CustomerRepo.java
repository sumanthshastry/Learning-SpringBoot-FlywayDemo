package com.shastry.flyway.demo.FlywayDemo.repo;

import com.shastry.flyway.demo.FlywayDemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
