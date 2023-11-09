package com.exchangerate.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import com.exchangerate.repository.ExchangeRepository;

@RequiredArgsConstructor
@Service
public class ExchangeRateServiceImpl {
    private final RestTemplate restTemplate;

    private final ExchangeRepository exchangeRepository;

    public String getAllTodos() {
        String apiUrl = "https://mocki.io/v1/1e26abb9-d48e-42b9-995d-54cddecfbae2";
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
