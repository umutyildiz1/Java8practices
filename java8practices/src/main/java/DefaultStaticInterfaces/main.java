package DefaultStaticInterfaces;

import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        //Stream<Vehicle> stream = Stream.of(BMW::new);//Vehicle not functional interface error
        Vehicle vehicle= new BMW();
        vehicle.drive();
        Vehicle.brake();
    }
}
