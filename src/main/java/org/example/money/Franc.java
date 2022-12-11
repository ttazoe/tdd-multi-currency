package org.example.money;

public class Franc {
    private int amount;

    public Franc(int amount){
        this.amount = amount;
    }

    public Franc times (int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    public boolean equals(Object object){
        if (object instanceof Franc) {
            Franc franc = (Franc) object;
            return this.amount == franc.amount;
        }
        return false;
    }

}
