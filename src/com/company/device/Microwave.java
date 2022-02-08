package com.company.device;

public class Microwave  extends Device{
    public Microwave() {
        super("Microwave");
    }

    @Override
    public void Sound() {
        System.out.println("Wvz vwzv zwvzvwzv");
    }

    @Override
    public void Show() {
        System.out.println("Microwave");
    }

    @Override
    public void Description() {
        System.out.println("Its Microwave");
    }
}
