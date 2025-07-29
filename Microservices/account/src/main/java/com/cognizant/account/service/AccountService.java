package com.cognizant.account.service;

import com.cognizant.account.model.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    @Qualifier("AccountList")
    public List<Accounts> accounts;

    public Accounts getAccounts(String number){
        return accounts.stream().filter(accounts -> accounts.getNumber().equalsIgnoreCase(number))
                .findFirst()
                .orElse(null);
    }
}
