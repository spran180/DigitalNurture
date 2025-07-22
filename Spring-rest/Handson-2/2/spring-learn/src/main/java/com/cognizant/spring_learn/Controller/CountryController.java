package com.cognizant.spring_learn.Controller;

import com.cognizant.spring_learn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    @Qualifier("in")
    private Country country;

    @RequestMapping("/country")
    public Country getCountryIndia(){
        return country;
    }
}
