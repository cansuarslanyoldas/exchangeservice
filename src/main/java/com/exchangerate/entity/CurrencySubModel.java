package com.exchangerate.entity;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
@Data
class CurrencySubModel {
    private String source;
    private List<Rate> rates = new ArrayList<>();

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }
}
