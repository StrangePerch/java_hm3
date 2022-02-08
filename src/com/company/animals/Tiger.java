package com.company.animals;

public class Tiger extends Animal {
    public Tiger() {
        super(AnimalType.Carnivores, "Tiger", 200, 50);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
}
