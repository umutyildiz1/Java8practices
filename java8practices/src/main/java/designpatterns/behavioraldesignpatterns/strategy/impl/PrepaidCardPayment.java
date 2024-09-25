package DesignPatterns.behavioraldesignpatterns.strategy.impl;

public class PrepaidCardPayment implements PayStrategy{
    @Override
    public Boolean pay(int amount) {
        System.out.println("PrepaidCardPayment is successfully");
        return Boolean.TRUE;
    }
}
