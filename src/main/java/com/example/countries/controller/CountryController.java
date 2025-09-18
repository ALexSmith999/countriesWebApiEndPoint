package com.example.countries.controller;

import com.example.countries.entity.Country;
import com.example.countries.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    // 1. Get all countries
    @GetMapping
    public List<Country> getAllCountries() {
        return service.getAllCountries();
    }

    // 2. Get info about a particular country
    @GetMapping("/{name}")
    public Country getCountryByName(@PathVariable String name) {
        return service.getCountryByName(name);
    }

    // 3. Countries with population > param
    @GetMapping("/population/greater/{value}")
    public List<Country> getCountriesWithPopulationGreater(@PathVariable Long value) {
        return service.getCountriesWithPopulationGreaterThan(value);
    }

    // 4. Countries with population < param
    @GetMapping("/population/less/{value}")
    public List<Country> getCountriesWithPopulationLess(@PathVariable Long value) {
        return service.getCountriesWithPopulationLessThan(value);
    }
}
