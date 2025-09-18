package com.example.countries.repository;

import com.example.countries.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> findByName(String name);

    List<Country> findByPopulationGreaterThan(Long population);

    List<Country> findByPopulationLessThan(Long population);
}
