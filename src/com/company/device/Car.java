package com.company.device;

public class Car extends Device {
    public Car() {
        super("Car");
    }

    @Override
    public void Sound() {
        System.out.println("Br br br br brb");
    }

    @Override
    public void Show() {
        System.out.println("Car");
    }

    @Override
    public void Description() {
        System.out.println("Its car");
    }
}
