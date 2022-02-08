package com.company.human;

public class Sailor extends Human {
    private float distanceTraveled;

    public Sailor(String name, int age) {
        super(name, age);
        this.distanceTraveled = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.distanceTraveled;
    }

    public void sail(float distance) {
        this.distanceTraveled += distance;
    }
}
