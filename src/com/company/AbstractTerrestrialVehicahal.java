package com.company;

public abstract class AbstractTerrestrialVehicahal extends AbstractVehichal {

    public AbstractTerrestrialVehicahal(String model) {
        super(model);
    }

    public abstract void drive();

    public abstract void drift();
}
