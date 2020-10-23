package com.solvd.lab.automation.sshukalovich.c3.enums;

public enum Color {
    BLACK(0x000000),
    BLUE(0x0000ff);

    private int value;

    Color(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
