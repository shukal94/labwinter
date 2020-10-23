package com.solvd.lab.automation.sshukalovich.c3.model.button;

import com.solvd.lab.automation.sshukalovich.c3.enums.Color;
import com.solvd.lab.automation.sshukalovich.c3.model.Coordinates2D;

public final class Checkbox extends AbstractButton {
    private int width;
    private int height;

    public Checkbox(String name, Coordinates2D coordinates2D, String text, int width, int height, Color color) {
        super(name, coordinates2D, text, color);
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Checkbox");
    }

    @Override
    public void click() {

    }
}
