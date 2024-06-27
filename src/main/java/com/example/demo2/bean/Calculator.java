package com.example.demo2.bean;

import jakarta.ejb.Remote;

@Remote
public interface Calculator {
    public int add(int a, int b);
    public int subtract(int a, int b);
    public int getTotal();
}
