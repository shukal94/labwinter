package com.solvd.lab.automation.sshukalovich.с9.calculation;

import com.solvd.lab.automation.sshukalovich.с9.interfaces.Operation;
import com.solvd.lab.automation.sshukalovich.с9.operation.DoubleOperation;
import com.solvd.lab.automation.sshukalovich.с9.operation.IntOperation;

import java.util.Map;
import java.util.Objects;

class Calculator<T extends Number> {
    private static final Map<Class<?>, Operation> types =
            Map.of(
                    Integer.class, new IntOperation(),
                    Double.class, new DoubleOperation()
            );

    public T add(T a, T b) {
        Objects.requireNonNull(a, "The first operand should not be null!");
        Objects.requireNonNull(b, "The second operand should not be null!");

        return (T) types.get(a.getClass()).add(a, b);
    }

}

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> a = new Calculator<>();
        System.out.println(a.add(1, 2));
    }

}
