package designpatterns.cretionalpatterns.abstractfactory.entity.abstracts;

public abstract class Chair {
    private final String type;

    public Chair(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
