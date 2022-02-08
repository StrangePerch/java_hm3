package com.company.animals;

public class Crocodile extends Animal {

    public Crocodile() {
        super(AnimalType.Omnivores, "Crocodile", 1000, 48);
    }

    @Override
    public void makeSound() {
        System.out.println("Croak!");
    }
}
