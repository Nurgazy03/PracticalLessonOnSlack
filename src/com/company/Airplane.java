package com.company;

public class Airplane extends  AbstractAirVehichal{

    public Airplane(String model) {
        super(model);
    }

    @Override
    public void fly() {
        System.out.println(getModel()+" is flaying with passenger");
    }

    @Override
    public void land() {
        System.out.println(getModel()+" is gonna to land");
    }

    public void cargoCarrier() {
        System.out.println(getModel()+" can cargo carrier");
    }

    public void fighter() {
        System.out.println(getModel()+" can throw bomb");
    }

    @Override
    public void be() {
        System.out.println(getModel()+" can be airplane");
    }
}
