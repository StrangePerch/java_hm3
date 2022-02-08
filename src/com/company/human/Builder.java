package com.company.human;

public class Builder extends Human {
    private int housesBuilt;
    public Builder(String name, int age){
        super(name, age);
        housesBuilt = 0;
    }

    public void Build(){
        housesBuilt++;
    }

    public int getHousesBuilt(){
        return housesBuilt;
    }

    public String toString(){
        return "Name: " + name + " Age: " + age + " Houses built: " + housesBuilt;
    }
}
