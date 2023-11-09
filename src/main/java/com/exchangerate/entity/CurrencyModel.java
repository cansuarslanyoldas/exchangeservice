package com.exchangerate.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class CurrencyModel {
    private List<CurrencySubModel> currencies = new ArrayList<>();

    public List<CurrencySubModel> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<CurrencySubModel> currencies) {
        this.currencies = currencies;
    }
}
