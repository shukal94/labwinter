package com.solvd.lab.automation.sshukalovich.с9.operation;

import com.solvd.lab.automation.sshukalovich.с9.interfaces.Operation;

import java.util.Objects;

public class DoubleOperation  implements Operation<Double> {
    @Override
    public Double add(Double valFirst, Double valSecond) {

        return valFirst + valSecond;
    }

    @Override
    public Double sub(Double valFirst, Double valSecond) {

        return valFirst - valSecond;
    }

    @Override
    public Double divide(Double valFirst, Double valSecond) {

        return valFirst / valSecond;
    }

    @Override
    public Double mul(Double valFirst, Double valSecond) {

        return valFirst * valSecond;
    }
}
