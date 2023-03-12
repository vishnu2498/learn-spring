package com.learn.sping.learnspringboot.Controllers;

import com.learn.sping.learnspringboot.CurrencyServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")

public class CurrencyController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @GetMapping("/getConfig")
    public CurrencyServiceConfiguration getAllConfig() {
        return currencyServiceConfiguration;
    }
}
