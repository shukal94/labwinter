package com.solvd.lab.automation.sshukalovich.c3.enums;

public enum Axis {
    X("Horizontal", "abs"),
    Y("Vertical", "ord");

    private String description;
    private String axis;

    Axis(String description, String axis) {
        this.description = description;
        this.axis = axis;
    }

    public String description() {
        return description;
    }

    public String axis() {
        return axis;
    }
}
