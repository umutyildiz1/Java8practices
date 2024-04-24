package Java8.lambdaexpression;

public class lambda {
    public static void main(String[] args) {
        // Lambda expression is an example of Functional Interface
        // Only used with Functional Interfaces
        // (An interface with a single
        // abstract method is called a functional interface)

        // lambda parameter -> body

        //lambda expressions can only be used to implement functional interfaces.

        FuncI lambda = () -> System.out.println("Hellooo");
        lambda.operate();
        lambda.someMethod2();//Functional Interface can have more than one
        // default or static method
    }

    interface FuncI{//Functional Interface
        void operate();
        //void operate2(); Functional Interface must have only one abstract method
        default void someMethod(){
            System.out.println("Default 1");
        }
        default void someMethod2(){
            System.out.println("Default 2");
        }
        static void someMethod3(){
            System.out.println("Static 1");
        }
        static void someMethod4(){
            System.out.println("Static 2");
        }
    }
}

