package com.shastry.flyway.demo.FlywayDemo.repo;

import com.shastry.flyway.demo.FlywayDemo.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepo extends JpaRepository<Artist, Integer> {
}
