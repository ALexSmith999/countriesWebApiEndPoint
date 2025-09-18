package com.example.countries.service;

import com.example.countries.model.Country;
import com.example.countries.repository.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private static final Logger logger = LoggerFactory.getLogger(CountryService.class);

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<String> getAllCountryNames() {
        logger.info("Fetching all country names from repository");
        return countryRepository.findAll()
                .stream()
                .map(Country::getName)
                .toList();
    }
}
