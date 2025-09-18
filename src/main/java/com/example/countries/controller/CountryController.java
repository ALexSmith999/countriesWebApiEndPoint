package com.example.countries.controller;

import com.example.countries.model.Country;
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

    @GetMapping
    public List<String> getAllCountryNames() {
        return service.getAllCountryNames();
    }

    @GetMapping("/{name}")
    public Country getCountryByName(@PathVariable String name) {
        return service.getCountryByName(name);
    }

    @GetMapping("/population/greater")
    public List<Country> getCountriesPopulationGreater(@RequestParam Long population) {
        return service.getCountriesPopulationGreaterThan(population);
    }

    @GetMapping("/population/less")
    public List<Country> getCountriesPopulationLess(@RequestParam Long population) {
        return service.getCountriesPopulationLessThan(population);
    }
}
