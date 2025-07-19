package com.cognizant.orm.learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    @Id
    private String co_code;

    @Column(name = "co_name")
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCo_code(String coCode) {
        this.co_code = coCode;
    }

    public String getCo_code() {
        return co_code;
    }
}
