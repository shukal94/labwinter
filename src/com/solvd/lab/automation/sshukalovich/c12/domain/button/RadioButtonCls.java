package com.solvd.lab.automation.sshukalovich.c12.domain.button;

import com.solvd.lab.automation.sshukalovich.c12.domain.base.BaseUIComponent;
import com.solvd.lab.automation.sshukalovich.c12.domain.coordinate.Point;

public final class RadioButtonCls extends BaseUIComponent implements com.solvd.lab.automation.sshukalovich.c12.domain.interfaces.RadioButton {
    private int radius;

    public RadioButtonCls(int color, Point coordinates, String text, int radius) {
        super(color, coordinates, text);
        this.radius = radius;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    @Override
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void click() {

    }
}
