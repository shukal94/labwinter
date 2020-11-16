package com.solvd.lab.automation.sshukalovich.c12.domain.base;

import com.solvd.lab.automation.sshukalovich.c12.domain.coordinate.Point;
import com.solvd.lab.automation.sshukalovich.c12.domain.interfaces.UIComponent;

public abstract class BaseUIComponent implements UIComponent {
    private int color;
    private Point coordinates;
    private String text;

    public BaseUIComponent(int color, Point coordinates, String text) {
        this.color = color;
        this.coordinates = coordinates;
        this.text = text;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
