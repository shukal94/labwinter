package com.solvd.lab.automation.sshukalovich.c3.model.button;

import com.solvd.lab.automation.sshukalovich.c3.enums.Color;
import com.solvd.lab.automation.sshukalovich.c3.model.Coordinates2D;

public final class RadioButton extends AbstractButton {
    private int radius;

    public RadioButton(String name, Coordinates2D coordinates2D, String text, int radius, Color color) {
        super(name, coordinates2D, text, color);
        this.radius = radius;
        System.out.println("Child");
    }

    @Override
    public void draw() {
        System.out.println("Drawing radiobutton");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void click() {

    }

    @Override
    public String toString() {
        return "RadioButton {\n\tname:" + name +
                "\n\tcoordinates: " + coordinates.toString() +
                "\n\tradius: " + radius +
                "\n\ttext: " + text +
                "\n\tcolor: " + color +
                "\n}";
    }

}
