package com.solvd.lab.automation.sshukalovich.c3.interfaces;

public interface IInput extends IComponent {
    void sendKey(char key);
    void sendKeys(char[] keys);
    void clear(int pos);
    void clearAll();
}
