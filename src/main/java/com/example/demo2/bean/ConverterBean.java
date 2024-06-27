package com.example.demo2.bean;

import jakarta.ejb.*;

import java.math.BigDecimal;

@Stateless
public class ConverterBean implements Converter {
    private BigDecimal yenRate = new BigDecimal("83.0602");
    private BigDecimal euroRate = new BigDecimal("0.0093");

    @Override
    public BigDecimal dollarToYen(BigDecimal dollar) {
        return new BigDecimal(200);
    }

    @Override
    public BigDecimal yenToDollar(BigDecimal yen) {
        return new BigDecimal(200);
    }
}
