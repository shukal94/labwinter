package com.solvd.lab.automation.sshukalovich.c3.model.field;

import com.solvd.lab.automation.sshukalovich.c3.model.coordinate.Coordinates2D;

public final class InputField extends AbstractInputField {
    public InputField(int width, int height, Coordinates2D coordinate, String name) {
        super(width, height, coordinate, name);
    }

    @Override
    public void click() {

    }

    @Override
    public void draw() {

    }

    @Override
    public void sendKey(char key) {
        this.content.append(key);
    }

    @Override
    public void sendKeys(char[] keys) {
        for (char key : keys) {
            this.content.append(key);
        }
    }

    @Override
    public void clear(int pos) {
        this.content.deleteCharAt(pos);
    }

    @Override
    public void clearAll() {
        for (int posCount = this.content.length() - 1; posCount >= 0; posCount--) {
            this.content.deleteCharAt(posCount);
        }
    }
}
