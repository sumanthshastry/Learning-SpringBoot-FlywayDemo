package com.shastry.flyway.demo.FlywayDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Artist {

    @Id
    private Integer artistId;
    private String name;
}
