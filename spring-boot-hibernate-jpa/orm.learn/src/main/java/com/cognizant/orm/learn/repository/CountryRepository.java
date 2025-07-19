package com.cognizant.orm.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.orm.learn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
