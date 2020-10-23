package com.solvd.lab.automation.sshukalovich.c3.model.button;

import com.solvd.lab.automation.sshukalovich.c3.enums.Color;
import com.solvd.lab.automation.sshukalovich.c3.model.Coordinates2D;

public final class Button extends AbstractButton {
    private int width;
    private int heigth;

    public Button(String name, Coordinates2D coordinates2D, String text, int width, int height, Color color) {
        super(name, coordinates2D, text, color);
        this.heigth = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing button");
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void click() {

    }
}
