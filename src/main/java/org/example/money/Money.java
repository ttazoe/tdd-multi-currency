package org.example.money;

public class Money implements Expression {
    protected int amount;
    protected String currency;


    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.currency().equals(money.currency());
    }

    public String toString(){
        return this.amount + " " + this.currency;
    }



    public Money times(int multiplier){
        return new Money(this.amount * multiplier, this.currency);
    }

    public String currency(){
        return this.currency;
    };

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }


    public Expression plus(Money addend){
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(this.currency, to);
        return new Money(this.amount / rate, to);
    }
}
