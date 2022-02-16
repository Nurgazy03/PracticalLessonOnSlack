package com.company;

public class OffRoadVehichical extends AbstractTerrestrialVehicahal {

    public OffRoadVehichical(String model) {
        super(model);
    }

    @Override
    public void be() {
        System.out.println(getModel()+" can be a Off - Road vehicle ");
    }

    @Override
    public void drive() {
        System.out.println(getModel()+" is driving too fast");
    }

    @Override
    public void drift() {
        System.out.println(getModel()+" stop with drift");
    }

    public void attackOn() {
        System.out.println(getModel()+" can shoot and drive fast");
    }

    public void offDrive() {
        System.out.println(getModel()+"can drive in difficult");
    }


}
