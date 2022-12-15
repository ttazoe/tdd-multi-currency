package org.example.money;

import java.util.Map;
import java.util.HashMap;


public class Bank {
    private Map<Pair, Integer> rates = new HashMap<>();

    public Money reduce(Expression source, String to){
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate){
        rates.put(new Pair(from, to), rate);
    }

    public int rate (String from, String to) {
        if (from.equals(to)) return 1;
        return this.rates.get(new Pair(from,to));
    }


}
