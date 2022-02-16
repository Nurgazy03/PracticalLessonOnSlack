package com.company;

public class AirBaloon extends AbstractAirVehichal{

    public AirBaloon(String model) {
        super(model);
    }

    @Override
    public void be() {
        System.out.println(getModel()+" can be air balloon");
    }

    @Override
    public void fly() {
        System.out.println(getModel()+" flies slowly");
    }

    @Override
    public void land() {
        System.out.println(getModel()+" lands slowly too");
    }

    public void stay() {
        System.out.println(getModel()+"stay on place");
    }

    public void swinging() {
        System.out.println(getModel()+" is swinging site to sit on air");
    }


}
