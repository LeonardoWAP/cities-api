package com.github.LeonardoWAP.citiesapi.countries.repository;

import com.github.LeonardoWAP.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
