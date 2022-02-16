package com.company;

public class Car extends AbstractTerrestrialVehicahal{

    public Car(String model) {
        super(model);
    }

    @Override
    public void be() {
        System.out.println(getModel()+" can be car");
    }
    @Override
    public void drive() {
        System.out.println(getModel()+" is driving in high speed");
    }

    @Override
    public void drift() {
        System.out.println(getModel()+" is drifting");
    }

    public void chasing() {
        System.out.println(getModel()+" can chasing");
    }

    public void turn() {
        System.out.println(getModel()+" can turn around");
    }


}
