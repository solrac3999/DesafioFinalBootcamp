package com.github.carlosh.countries.repositories;

import com.github.carlosh.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
