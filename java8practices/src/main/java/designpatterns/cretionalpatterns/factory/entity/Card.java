package DesignPatterns.cretionalpatterns.factory.entity;

import java.math.BigDecimal;

public abstract class Card {

    public void pay(BigDecimal amount){
        System.out.printf("Payment is successful amount %s with %s%n",amount, getCardType().getName());
    }

    abstract CardType getCardType();
}
