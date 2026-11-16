package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getFuelCapacity());


        Car corolla = new Car();
        corolla.startEngine();
        corolla.setTopSpeed(190);
        System.out.println(corolla.getTopSpeed());


        SemiTruck tanker = new SemiTruck();
        tanker.setColor("White");
        System.out.println(tanker.getColor());
         tanker.startEngine();
        System.out.println("Tanker");
        tanker.accelerate();
        tanker.setTopSpeed(150);
        System.out.println(tanker.getTopSpeed());
        tanker.brake();
        tanker.stopEngine();







    }


}
