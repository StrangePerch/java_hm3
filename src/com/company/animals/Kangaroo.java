package com.company.animals;

public class Kangaroo extends Animal {

    public Kangaroo() {
        super(AnimalType.Herbivores, "Kangaroo", 80, 70);
    }

    @Override
    public void makeSound() {
        System.out.println("I'm a kangaroo");
    }
}
