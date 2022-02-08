package com.company.human;

enum PilotCategory {
    Military,
    Commercial,
    Passenger,
    Amateur,
}

public class Pilot extends Human {
    private PilotCategory category;
    private int flightHours;

    public Pilot(String name, int age, PilotCategory category) {
        super(name, age);
        this.category = category;
    }

    public void Fly(int hours) {
        flightHours += hours;
        System.out.println("Pilot " + name + " has flown " + hours + " hours");
    }

    public int getFlightHours() {
        return flightHours;
    }

    public PilotCategory getCategory() {
        return category;
    }

    public void setCategory(PilotCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + " " + category;
    }
}
