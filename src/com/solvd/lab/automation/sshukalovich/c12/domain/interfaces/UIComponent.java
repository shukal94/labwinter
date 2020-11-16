package com.solvd.lab.automation.sshukalovich.c12.domain.interfaces;

import com.solvd.lab.automation.sshukalovich.c12.domain.coordinate.Point;

public interface UIComponent {
    int getColor();
    void setColor(int color);
    void setCoordinates(Point coordinates);
    String getText();
    Point getCoordinates();
    void setText(String text);
}
