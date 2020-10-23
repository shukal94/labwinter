package com.solvd.lab.automation.sshukalovich.c3.interfaces;

public interface IComponent {
    void click();
    void draw();
    void sendKey(char key);
    void sendKeys(char[] keys);
    void clear(int pos);
    void clearAll();
}