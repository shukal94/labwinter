package com.solvd.lab.automation.sshukalovich.c3.model;

import com.solvd.lab.automation.sshukalovich.c3.interfaces.IComponent;
import com.solvd.lab.automation.sshukalovich.c3.model.coordinate.Coordinates2D;

public abstract class UIComponent implements IComponent {
    protected String name;
    protected Coordinates2D coordinates;

    public UIComponent(String name, Coordinates2D coordinates2D) {
        this.coordinates = coordinates2D;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates2D getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates2D coordinates) {
        this.coordinates = coordinates;
    }
}
