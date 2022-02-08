package com.company.animals;

public abstract class Animal {
    public AnimalType type;
    public String name;
    public float weight;
    public float speed;

    public Animal(AnimalType type, String name, float weight, float speed) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
