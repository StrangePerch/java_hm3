package com.company.device;

public class Kettle  extends Device{
    public Kettle() {
        super("Kettle");
    }

    @Override
    public void Sound() {
        System.out.println("Bul bul bul");
    }

    @Override
    public void Show() {
        System.out.println("Kettle");
    }

    @Override
    public void Description() {
        System.out.println("Its Kettle");
    }
}
