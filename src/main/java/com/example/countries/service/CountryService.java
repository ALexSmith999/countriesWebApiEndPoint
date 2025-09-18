package com.example.countries.service;

import com.example.countries.entity.Country;
import com.example.countries.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    public Country getCountryByName(String name) {
        return repository.findByNameIgnoreCase(name);
    }

    public List<Country> getCountriesWithPopulationGreaterThan(Long population) {
        return repository.findByPopulationGreaterThan(population);
    }

    public List<Country> getCountriesWithPopulationLessThan(Long population) {
        return repository.findByPopulationLessThan(population);
    }
}
