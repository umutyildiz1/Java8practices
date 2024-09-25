package DesignPatterns.behavioraldesignpatterns.strategy.impl;

public class CreditCardPayment implements PayStrategy{
    @Override
    public Boolean pay(int amount) {
        System.out.println("CreditCardPayment is successfully");
        return Boolean.TRUE;
    }
}
