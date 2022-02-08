package com.company.money;

public class Money {
    private int amount;
    private String currency;
    private int pennies;

    public Money(int amount, int pennies, String currency) {
        this.amount = amount;
        this.pennies = pennies;
        this.currency = currency;
    }

    public Money(float amount, String currency) {
        this.amount = (int)amount;
        this.pennies = (int)(amount * 100 % 100);
        this.currency = currency;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPennies(int pennies) {
        this.pennies = pennies;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getAmount() {
        return amount + pennies / 100.f;
    }

    public int getPennies() {
        return pennies;
    }

    public String getCurrency() {
        return currency;
    }

    public void add(Money money) {
        if (money.getCurrency().equals(currency)) {
            amount += money.getAmount();
            pennies += money.getPennies();
            while (pennies >= 100) {
                pennies -= 100;
                amount++;
            }
        } else {
            throw new IllegalArgumentException("Different currencies");
        }
    }

    public void subtract(Money money) {
        if (money.getCurrency().equals(currency)) {
            amount -= money.getAmount();
            pennies -= money.getPennies();
            while (pennies < 0) {
                pennies += 100;
                amount--;
            }
        } else {
            throw new IllegalArgumentException("Different currencies");
        }
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof Money) {
            Money money = (Money) object;
            return getAmount() == money.getAmount();
        }
        return false;
    }

    public String toString() {
        return currency + " " + amount + "." + pennies;
    }
}

