package com.shastry.flyway.demo.FlywayDemo.controller;

import com.shastry.flyway.demo.FlywayDemo.model.Artist;
import com.shastry.flyway.demo.FlywayDemo.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/artist")
@RequiredArgsConstructor
public class ArtistController {

    private final ArtistService artistService;

    @GetMapping("/{artistId}")
    public Artist get(@PathVariable Integer artistId) {
        return artistService.get(artistId);
    }

    @GetMapping
    public List<Artist> getAll() {
        return artistService.getAllCustomers();
    }
}
