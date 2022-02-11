package DefaultStaticInterfaces;


public interface Vehicle {
    default void drive() {//default methods can override with class without forcing. I noticed that.
        System.out.println("Vehicle drives.");
    }

    static void brake(){//static methods can not override.
        System.out.println("Vehicle brakes.");//static method can not accessible from instance of class
        //It can accessible only from Vehicle.brake()
    }
}
