package com.solvd.lab.automation.sshukalovich.c3.model.button;

import com.solvd.lab.automation.sshukalovich.c3.enums.Color;
import com.solvd.lab.automation.sshukalovich.c3.interfaces.IClick;
import com.solvd.lab.automation.sshukalovich.c3.model.Coordinates2D;
import com.solvd.lab.automation.sshukalovich.c3.model.UIComponent;

public abstract class AbstractButton extends UIComponent implements IClick {
    protected String text;
    protected Color color;
    private boolean clicked;

    public AbstractButton(String name, Coordinates2D coordinates2D, String text, Color color) {
        super(name, coordinates2D);
        this.text = text;
        this.color = color;
        this.clicked = false;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    @Override
    public int hashCode(){
        return (color.getValue() + text.hashCode());
    }

    @Override
    public void sendKey(char key) {
        throw new RuntimeException("not implemented!");
    }

    @Override
    public void sendKeys(char[] keys) {
        throw new RuntimeException("not implemented!");
    }

    @Override
    public void clear(int pos) {
        throw new RuntimeException("not implemented!");
    }

    @Override
    public void clearAll() {
        throw new RuntimeException("not implemented!");
    }

}
