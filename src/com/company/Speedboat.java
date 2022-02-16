package com.company;

public class Speedboat extends AbstractAqueousVehichal{

    public Speedboat(String model) {
        super(model);
    }

    @Override
    public void be() {
        System.out.println(getModel()+" can be speedboat");
    }
    @Override
    public void swim() {
        System.out.println(getModel()+" is floating");
    }

    @Override
    public void stop() {
        System.out.println(getModel()+" stops abruptly");
    }

    public void racer() {
        System.out.println(getModel()+"can participate in the race");
    }

    public void attack() {
        System.out.println(getModel()+"can shoot");
    }


}
