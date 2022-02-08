package com.company.money;

public class Product {
    private Money cost;

    public Product(Money cost) {
        this.cost = cost;
    }

    public boolean Buy(Money money) {
        if (money.getAmount() >= cost.getAmount() && money.getPennies() >= cost.getPennies()) {
            money.subtract(cost);
            return true;
        }
        return false;
    }

    public Money getCost() {
        return cost;
    }

    public void setCost(Money cost) {
        this.cost = cost;
    }
}
