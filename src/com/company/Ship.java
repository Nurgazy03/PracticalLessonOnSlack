package com.company;

public class Ship extends AbstractAqueousVehichal {

    public Ship(String model) {
        super(model);
    }

    @Override
    public void be() {
        System.out.println(getModel()+" can be ship");
    }
    @Override
    public void swim() {
        System.out.println(getModel()+" is slowly getting to shore");
    }

    @Override
    public void stop() {
        System.out.println(getModel()+" has stopped and stay on place");
    }

    public void swinging() {
        System.out.println(getModel()+"swings on water");
    }

    public void transit() {
        System.out.println(getModel()+"can carry cargo");
    }


}
