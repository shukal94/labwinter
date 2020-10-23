package com.solvd.lab.automation.sshukalovich.c3.factory;

import com.solvd.lab.automation.sshukalovich.c3.enums.Color;
import com.solvd.lab.automation.sshukalovich.c3.model.Coordinates2D;
import com.solvd.lab.automation.sshukalovich.c3.model.button.Button;

public class ButtonFactory {
    public static Button createBlackButton
            (String name, Coordinates2D coordinates2D, String text, int width, int height) {
        return new Button(name, coordinates2D, text, width, height, Color.BLACK);
    }

    public static Button createBlueButton
            (String name, Coordinates2D coordinates2D, String text, int width, int height) {
        return new Button(name, coordinates2D, text, width, height, Color.BLUE);
    }
}
