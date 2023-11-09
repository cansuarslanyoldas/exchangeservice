package com.exchangerate.controller;

import com.exchangerate.repository.ExchangeRepository;
import com.exchangerate.service.ExchangeRateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ExchangeController {

    private ExchangeRateService exchangeRateService;
    @GetMapping("/todos")
    public String getAllTodos() {
        return exchangeRateService.getAllTodos();
    }
}
