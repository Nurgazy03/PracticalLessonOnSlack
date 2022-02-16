package com.company;

public abstract class AbstractVehichal {

    private String model;

    public AbstractVehichal(String model) {
        this.model = model;
    }

    public abstract void be();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
