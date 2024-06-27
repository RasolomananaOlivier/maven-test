package com.example.demo2.bean;

import jakarta.ejb.Stateless;

@Stateless
public class CalculatorBean implements  Calculator{
    private int total= 0;
    @Override
    public int add(int a, int b) {
        total += a+ b;
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int getTotal() {
        return total;
    }
}
