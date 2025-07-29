package com.cognizant.account.controller;

import com.cognizant.account.model.Accounts;
import com.cognizant.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class Controller {

    @Autowired
    public AccountService service;

    @GetMapping("/{number}")
    public Accounts getAccount(@PathVariable String number) {
        return this.service.getAccounts(number);
    }
}
