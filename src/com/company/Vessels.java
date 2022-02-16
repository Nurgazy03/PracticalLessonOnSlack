package com.company;

public class Vessels extends AbstractAqueousVehichal{

    public Vessels(String model) {
        super(model);
    }

    @Override
    public void be() {
        System.out.println(getModel()+" can be vessels");
    }
    @Override
    public void swim() {
        System.out.println(getModel()+" accommodates many passenger");
    }

    @Override
    public void stop() {
        System.out.println(getModel()+" overcomes long distance");
    }

    public void sound() {
        System.out.println(getModel()+" is giving sound");
    }

    public void swings() {
        System.out.println(getModel()+" swings site to site on water");
    }


}
