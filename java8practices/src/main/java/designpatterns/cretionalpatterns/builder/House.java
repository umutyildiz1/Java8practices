package DesignPatterns.cretionalpatterns.builder;

public class House {
    private int doors;
    private int windows;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    private House(HouseBuilder builder) {
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    public static class HouseBuilder {//Fluent Interface
        private int doors;
        private int windows;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        public HouseBuilder(int doors, int windows) {
            this.doors = doors;
            this.windows = windows;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House with " + doors + " doors, " + windows + " windows, " +
                (hasGarage ? "a garage" : "no garage") +
                ", and " + (hasSwimmingPool ? "a swimming pool." : "no swimming pool.");
    }

    public static HouseBuilder builder(int doors, int windows){
        return new HouseBuilder(doors, windows);
    }
}