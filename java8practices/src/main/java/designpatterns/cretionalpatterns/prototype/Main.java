package DesignPatterns.cretionalpatterns.prototype;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(123);
        rectangle.setWeight(456);
        Rectangle rectangle1 = (Rectangle) rectangle.clone(); // This pattern can be applied with " Cloneable " interface
        Rectangle rectangle2 = (Rectangle) rectangle.clone();

        System.out.println("Rectangle : " + rectangle);
        System.out.println("Rectangle1 : " + rectangle1);
        System.out.println("Rectangle2 : " + rectangle2);

        System.out.println("Rectangle Reference Num : " + "@" + Integer.toHexString(rectangle.hashCode()));
        System.out.println("Rectangle1 Reference Num : " + Integer.toHexString(rectangle1.hashCode()));
        System.out.println("Rectangle2 Reference Num : " + Integer.toHexString(rectangle2.hashCode()));

        //For we want to generate new  complex and costly object, every new operation is become difficult.
        //Prototype DP is focus on initiate(COPY OF EXACT OBJECT (not including reference number of object))
        // new complex objects without coupling their concrete classes
        //

    }
}
