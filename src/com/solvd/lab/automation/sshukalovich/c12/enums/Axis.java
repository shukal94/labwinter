package com.solvd.lab.automation.sshukalovich.c12.enums;

public enum Axis {
    X("x"),
    Y("y");

    private String value;

    Axis(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
