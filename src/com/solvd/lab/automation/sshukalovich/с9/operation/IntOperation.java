package com.solvd.lab.automation.sshukalovich.с9.operation;

import com.solvd.lab.automation.sshukalovich.с9.interfaces.Operation;

import java.util.Objects;

public class IntOperation implements Operation<Integer> {
    @Override
    public Integer add(Integer valFirst, Integer valSecond) {

        return valFirst + valSecond;
    }

    @Override
    public Integer sub(Integer valFirst, Integer valSecond) {

        return valFirst - valSecond;
    }

    @Override
    public Integer divide(Integer valFirst, Integer valSecond) {

        return valFirst / valSecond;
    }

    @Override
    public Integer mul(Integer valFirst, Integer valSecond) {

        return valFirst * valSecond;
    }
}
