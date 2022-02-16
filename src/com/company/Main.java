package com.company;

public class Main {

    public static void main(String[] args) {

        AbstractVehichal[] vehicle = {new AirBaloon("AllGround"), new Airplane("ATR"), new Helicopter("bell222"),
                new Ship("Kliper"), new Vessels("Balker"), new Speedboat("Flipper"),
                new Car("Mercedes - Benz"), new OffRoadVehichical("Dodge"), new Bus("Nef A3")};

        for (AbstractVehichal vehicle2 : vehicle) {
            if (vehicle2 instanceof Car) {
                ((Car) vehicle2).be();
                ((Car) vehicle2).drift();
                ((Car) vehicle2).drive();
                ((Car) vehicle2).chasing();
                ((Car) vehicle2).turn();

                System.out.println("------------------------------------------");

            }

            if (vehicle2 instanceof OffRoadVehichical) {
                ((OffRoadVehichical) vehicle2).be();
                ((OffRoadVehichical) vehicle2).attackOn();
                ((OffRoadVehichical) vehicle2).offDrive();
                ((OffRoadVehichical) vehicle2).drift();
                ((OffRoadVehichical) vehicle2).drive();

                System.out.println("------------------------------------------");

            }

            if (vehicle2 instanceof Bus) {
                ((Bus) vehicle2).be();
                ((Bus) vehicle2).drive();
                ((Bus) vehicle2).drift();
                ((Bus) vehicle2).transportation();
                ((Bus) vehicle2).turn2();

                System.out.println("------------------------------------------");

            }

            if (vehicle2 instanceof AirBaloon) {
                ((AirBaloon) vehicle2).be();
                ((AirBaloon) vehicle2).fly();
                ((AirBaloon) vehicle2).land();
                ((AirBaloon) vehicle2).stay();
                ((AirBaloon) vehicle2).swinging();

                System.out.println("------------------------------------------");

            }

            if (vehicle2 instanceof Airplane) {
                ((Airplane) vehicle2).be();
                ((Airplane) vehicle2).fly();
                ((Airplane) vehicle2).land();
                ((Airplane) vehicle2).cargoCarrier();
                ((Airplane) vehicle2).fighter();

                System.out.println("------------------------------------------");

            }

            if (vehicle2 instanceof Helicopter) {
                ((Helicopter) vehicle2).be();
                ((Helicopter) vehicle2).fly();
                ((Helicopter) vehicle2).land();
                ((Helicopter) vehicle2).givingSound();
                ((Helicopter) vehicle2).fighter2();

                System.out.println("------------------------------------------");

            }

            if (vehicle2 instanceof Ship) {
                ((Ship) vehicle2).be();
                ((Ship) vehicle2).swim();
                ((Ship) vehicle2).stop();
                ((Ship) vehicle2).swinging();
                ((Ship) vehicle2).transit();

                System.out.println("------------------------------------------");

            }

            if (vehicle2 instanceof Vessels) {
                ((Vessels)vehicle2).be();
                ((Vessels)vehicle2).swim();
                ((Vessels)vehicle2).stop();
                ((Vessels)vehicle2).sound();
                ((Vessels)vehicle2).swings();

                System.out.println("------------------------------------------");

            }

            if (vehicle2 instanceof Speedboat) {
                ((Speedboat)vehicle2).be();
                ((Speedboat)vehicle2).swim();
                ((Speedboat)vehicle2).stop();
                ((Speedboat)vehicle2).racer();
                ((Speedboat)vehicle2).attack();

            }

        }
    }
}
