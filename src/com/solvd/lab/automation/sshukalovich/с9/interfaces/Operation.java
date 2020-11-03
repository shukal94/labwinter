package com.solvd.lab.automation.sshukalovich.с9.interfaces;

public interface Operation<T extends Number> {
    T add(T valFirst, T valSecond);
    T sub(T valFirst, T valSecond);
    T divide(T valFirst, T valSecond);
    T mul(T valFirst, T valSecond);
}
