package com.solvd.lab.automation.sshukalovich.c12.domain.interfaces;

public interface InputField extends Clickable{
    int getWidth();
    int getHeight();
    void setWidth(int width);
    void setHeight(int height);
    String clear();
    String clearAll();
}
