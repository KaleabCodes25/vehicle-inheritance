package com.pluralsight;

public class Vehicle {
    private String model;
    private String color;
    private int topSpeed;
    private int fuelCapacity;
    private int numberOfPassengers;
    private int cargoCapacity;


    public void startEngine(){
        System.out.println(" 1.2.3 Start engine!!");

    }
    public void stopEngine(){
        System.out.println("Stop engine!!");
        topSpeed = 0;

    }
    public void accelerate(){
        System.out.println("Accelerate ");
        topSpeed += 10;

    }
    public void brake(){
        System.out.println("Slowing down!!");
        topSpeed -= 5;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
