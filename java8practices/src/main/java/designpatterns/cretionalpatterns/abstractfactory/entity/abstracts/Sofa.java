package DesignPatterns.cretionalpatterns.abstractfactory.entity.abstracts;

public abstract class Sofa {
    private final String type;

    public Sofa(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
