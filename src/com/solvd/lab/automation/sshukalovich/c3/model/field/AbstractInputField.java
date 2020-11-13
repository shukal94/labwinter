package com.solvd.lab.automation.sshukalovich.c3.model.field;

import com.solvd.lab.automation.sshukalovich.c3.interfaces.IClick;
import com.solvd.lab.automation.sshukalovich.c3.interfaces.IInput;
import com.solvd.lab.automation.sshukalovich.c3.model.coordinate.Coordinates2D;
import com.solvd.lab.automation.sshukalovich.c3.model.UIComponent;

public abstract class AbstractInputField extends UIComponent implements IClick, IInput {

    protected int width;
    protected int height;
    protected StringBuffer content = new StringBuffer();

    public AbstractInputField(int width, int height, Coordinates2D coordinate, String name) {
        super(name, coordinate);
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getContent() {
        return content.toString();
    }

}
