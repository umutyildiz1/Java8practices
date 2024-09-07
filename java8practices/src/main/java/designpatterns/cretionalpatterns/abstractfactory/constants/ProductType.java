package DesignPatterns.cretionalpatterns.abstractfactory.constants;

public enum ProductType {
    VICTORIAN("Victorian"),
    MODERN("Modern");

    private final String description;

    ProductType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
