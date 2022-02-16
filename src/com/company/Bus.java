package com.company;

public class Bus extends AbstractTerrestrialVehicahal{
    public Bus(String model) {
        super(model);
    }

    @Override
    public void be() {
        System.out.println(getModel()+" can be a bus");
    }

    @Override
    public void drive() {
        System.out.println(getModel()+" is driving");
    }

    @Override
    public void drift() {
        System.out.println(getModel()+" stopped dangerous");
    }

    public void transportation() {
        System.out.println(getModel()+" can carry people");
    }

    public void turn2() {
        System.out.println(getModel()+" turn left and right");
    }


}
