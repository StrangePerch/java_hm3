package com.company.device;

public class Ship  extends Device{
    public Ship() {
        super("Ship");
    }

    @Override
    public void Sound() {
        System.out.println("Ship sound");
    }

    @Override
    public void Show() {
        System.out.println("Ship");
    }

    @Override
    public void Description() {
        System.out.println("Its Ship");
    }
}
