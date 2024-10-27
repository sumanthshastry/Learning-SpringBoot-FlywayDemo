package com.shastry.flyway.demo.FlywayDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.time.OffsetDateTime;

@Data
@Entity
@Table
public class Employee {

    @Id
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String title;
    private Integer reportsTo;
    private OffsetDateTime birthDate;
    private OffsetDateTime hireDate;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String phone;
    private String fax;
    private String email;
}
