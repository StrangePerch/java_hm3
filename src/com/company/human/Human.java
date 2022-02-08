package com.company.human;

public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
}
