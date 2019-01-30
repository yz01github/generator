package com.it.bean;

public class Aaa {
    private String a;

    private Integer b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}