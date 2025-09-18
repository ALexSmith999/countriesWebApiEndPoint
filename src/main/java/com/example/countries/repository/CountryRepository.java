package com.example.countries.repository;

import com.example.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByNameIgnoreCase(String name);
    List<Country> findByPopulationGreaterThan(Long population);
    List<Country> findByPopulationLessThan(Long population);
}
