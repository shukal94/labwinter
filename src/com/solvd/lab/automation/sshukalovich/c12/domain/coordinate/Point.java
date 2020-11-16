package com.solvd.lab.automation.sshukalovich.c12.domain.coordinate;

import com.solvd.lab.automation.sshukalovich.c3.enums.Axis;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int value, Axis axis) {
        if (axis.equals(Axis.X)) {
            this.x = value;
        } else {
            this.y = value;
        }
    }

    public Point(int x, int y) {
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
        return x == ((Point) that).x && y == ((Point) that).getY();
    }

}
