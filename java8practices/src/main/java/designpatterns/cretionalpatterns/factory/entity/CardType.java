package DesignPatterns.cretionalpatterns.factory.entity;

public enum CardType {
    DEBIT_CARD("Debit Card"),
    CREDIT_CARD("Credit Card"),
    PREPAID_CARD("Prepaid Card");

    private final String name;

    CardType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
