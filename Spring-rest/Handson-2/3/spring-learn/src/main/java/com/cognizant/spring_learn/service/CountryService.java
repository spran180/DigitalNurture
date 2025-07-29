package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    @Qualifier("CountryList")
    private List<Country> countryList;

    public Country getCountry(String code){
        return countryList.stream().filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
