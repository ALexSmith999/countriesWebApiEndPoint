package com.example.countries.service;

import com.example.countries.model.Country;
import com.example.countries.repository.CountryRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CountryServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(CountryServiceTest.class);

    @Mock
    private CountryRepository countryRepository;

    @InjectMocks
    private CountryService countryService;

    @Test
    void testGetAllCountryNames() {
        logger.info("Starting test: testGetAllCountryNames");

        Country country1 = new Country();
        country1.setName("CountryA");

        Country country2 = new Country();
        country2.setName("CountryB");

        when(countryRepository.findAll()).thenReturn(Arrays.asList(country1, country2));

        List<String> names = countryService.getAllCountryNames();

        logger.info("Fetched country names: {}", names);
        assertEquals(2, names.size());
        assertEquals("CountryA", names.get(0));
        assertEquals("CountryB", names.get(1));
    }
}
