package com.company.device;

public abstract class Device {
    public String name;

    public Device(String name) {
        this.name = name;
    }

    public abstract void Sound();
    public abstract void Show();
    public abstract void Description();

}
