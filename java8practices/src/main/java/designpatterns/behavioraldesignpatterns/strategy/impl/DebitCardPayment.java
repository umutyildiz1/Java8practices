package DesignPatterns.behavioraldesignpatterns.strategy.impl;

public class DebitCardPayment implements PayStrategy{
    @Override
    public Boolean pay(int amount) {
        System.out.println("DebitCardPayment is successfully");
        return Boolean.TRUE;
    }
}
