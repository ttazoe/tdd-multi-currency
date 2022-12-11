package org.example.money;

public class Dollar {
    private int amount;

    public Dollar (int amount){
        this.amount = amount;
    }

    public Dollar times (int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    public boolean equals(Object object){
        if (object instanceof Dollar) {
            Dollar dollar = (Dollar) object;
            return this.amount == dollar.amount;
        }
        return false;
    }

}
