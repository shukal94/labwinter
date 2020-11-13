package com.solvd.lab.automation.sshukalovich.c3.factory;

import com.solvd.lab.automation.sshukalovich.c3.constant.SizeConstant;
import com.solvd.lab.automation.sshukalovich.c3.enums.Color;
import com.solvd.lab.automation.sshukalovich.c3.model.coordinate.Coordinates2D;
import com.solvd.lab.automation.sshukalovich.c3.model.button.RadioButton;

public class RadioButtonFactory {
    public static RadioButton createBigRadioButton(String name, Coordinates2D coordinates2D, String text, Color color) {
        return new RadioButton(name, coordinates2D, text, SizeConstant.BIG_RADIUS, color);
    }
}
