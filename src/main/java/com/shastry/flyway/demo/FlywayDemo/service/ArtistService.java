package com.shastry.flyway.demo.FlywayDemo.service;

import com.shastry.flyway.demo.FlywayDemo.model.Artist;
import com.shastry.flyway.demo.FlywayDemo.repo.ArtistRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtistService {

    private final ArtistRepo artistRepo;

    public Artist get(Integer id) {
        return artistRepo.findById(id).orElse(null);
    }

    public List<Artist> getAllCustomers() {
        return artistRepo.findAll();
    }
}
