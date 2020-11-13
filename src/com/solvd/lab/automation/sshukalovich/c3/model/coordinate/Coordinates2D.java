package com.solvd.lab.automation.sshukalovich.c3.model.coordinate;

import com.solvd.lab.automation.sshukalovich.c3.enums.Axis;

public class Coordinates2D {
    private int x;
    private int y;

    public Coordinates2D() {
        this(0, 0);
    }

    public Coordinates2D(int value, Axis axis) {
        if (axis.equals(Axis.X)) {
            this.x = value;
        } else {
            this.y = value;
        }
    }

    public Coordinates2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate2D {\n\tx: " + x + "\n\ty: " + "y\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        return x == ((Coordinates2D) that).x && y == ((Coordinates2D) that).getY();
    }

}
