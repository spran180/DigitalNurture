package com.cognizant.orm.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.orm.learn.repository.CountryRepository;
import com.cognizant.orm.learn.model.Country;
import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}

