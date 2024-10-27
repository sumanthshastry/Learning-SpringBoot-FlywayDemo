package com.shastry.flyway.demo.FlywayDemo.repo;

import com.shastry.flyway.demo.FlywayDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
