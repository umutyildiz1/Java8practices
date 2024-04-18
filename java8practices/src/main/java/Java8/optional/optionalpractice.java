package Java8.optional;

import java.util.Optional;

public class optionalpractice {
    public static void main(String[] args) {

        // Purpose : checking null pointer exception with more readable and functional

        //Creation of Optional
        System.out.println("-----------------------------------");
        System.out.println("Creation of Optional");

        Optional a = Optional.empty();
        //Optional b = Optional.of(null);//if value is null, throw NPE
        Optional c = Optional.ofNullable(null);//if value is null, return empty Optional
        System.out.println(c);


        //Checking Value

        System.out.println("-----------------------------------");
        System.out.println("Checking Value");
        System.out.println(c.isPresent());// if value is null, returns false
                                            // in Java 11 there is a method isEmpty, it works with opposite way
                                            //if value is null, returns true


        //Conditional Operations

        System.out.println("-----------------------------------");
        System.out.println("Conditional Operations");

        //ifPresent
        Optional<String> d = Optional.ofNullable("umut");
        d.ifPresent(value -> System.out.printf("value is present %s%n",value));

        //orElse
        //if value is null, orElse returns a default value
        String nullName = "umut";
        String name = Optional.ofNullable(nullName).orElse("john");
        System.out.println(name);

        //orElseGet
        //if value is null, takes a supplier for default value
        String nullName1 = null;
        String name1 = Optional.ofNullable(nullName1).orElseGet(() -> "john");

        //difference between orElse and orElseGet
        //orElse initiates default value when it useless but orElseGet not call the supplier in the same case

        //orElseThrow
        //if value is null throw an exception
        System.out.println("-----------------------------------");
        System.out.println("orElseThrow");
        try{
            String nullName2 = null;
            String name2 = Optional.ofNullable(nullName2).orElseThrow(
                    IllegalArgumentException::new);
        }catch (Exception e){
            System.out.println(e.getClass());
        }

    }
}
