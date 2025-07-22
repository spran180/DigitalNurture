package com.cognizant.spring_learn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger log = LoggerFactory.getLogger(Country.class);

    private String id;
    private String name;

    public Country() {
        log.debug("Inside Country Constructor");
    }

    public void setId(String id) {
        log.debug("Inside Country setId");
        this.id = id;
    }

    public String getId() {
        log.debug("Inside Country getId");
        return id;
    }

    public void setName(String name) {
        log.debug("Inside Country setName");
        this.name = name;
    }

    public String getName() {
        log.debug("Inside Country getName");
        return name;
    }

    @Override
    public String toString() {
        return "Country [code=" + id + ", name=" + name + "]";
    }
}
