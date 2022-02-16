package com.company;

public class Helicopter extends AbstractAirVehichal{


    public Helicopter(String model) {
        super(model);
    }

    @Override
    public void be() {
        System.out.println(getModel()+" be vehicle ");
    }

    @Override
    public void fly() {
        System.out.println(getModel()+" is flaying with noise");
    }

    @Override
    public void land() {
        System.out.println(getModel()+" is land lands differently");
    }

    public void fighter2() {
        System.out.println(getModel()+" can shoot");
    }

    public void givingSound() {
        System.out.println(getModel()+" make loud sound on flying time");
    }


}
