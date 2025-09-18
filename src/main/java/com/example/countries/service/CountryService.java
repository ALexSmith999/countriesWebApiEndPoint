package com.example.countries.service;

import com.example.countries.model.Country;
import com.example.countries.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {

    private final CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    public List<String> getAllCountryNames() {
        return repository.findAll().stream()
                .map(Country::getName)
                .collect(Collectors.toList());
    }

    public Country getCountryByName(String name) {
        return repository.findByName(name).orElse(null);
    }

    public List<Country> getCountriesPopulationGreaterThan(Long population) {
        return repository.findByPopulationGreaterThan(population);
    }

    public List<Country> getCountriesPopulationLessThan(Long population) {
        return repository.findByPopulationLessThan(population);
    }
}
