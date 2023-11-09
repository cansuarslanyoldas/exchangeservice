package com.exchangerate.entity;

import lombok.Data;

@Data
public class Rate {

    private String target;
    private int rate;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
