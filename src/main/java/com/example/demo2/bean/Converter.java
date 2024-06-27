package com.example.demo2.bean;

import jakarta.ejb.Remote;

import java.math.BigDecimal;

@Remote
public interface Converter {
    public BigDecimal dollarToYen(BigDecimal dollar);
    public BigDecimal yenToDollar(BigDecimal yen);
}
