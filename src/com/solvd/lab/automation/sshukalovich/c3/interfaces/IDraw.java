package com.solvd.lab.automation.sshukalovich.c3.interfaces;

public interface IDraw extends IComponent{
    void draw();

    default void showInfo() {
        System.out.println("info");
    }
}
