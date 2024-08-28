package DesignPatterns.cretionalpatterns.singleton;

import static DesignPatterns.cretionalpatterns.singleton.Singleton.getInstance;

public class Main {
    public static void main(String[] args) {

        //Singleton, ensures that only one instance created and provides only one access point

        //Singleton is an antipattern

        //violates the Single Responsibility Principle : solve 2 problem

        //single thread non thread safe example
        //there are various of singleton like non thread safe multithread and thread safe
        System.out.println(getInstance("Singleton 1").getValue());
        System.out.println(getInstance("Singleton 2").getValue());
        System.out.println(getInstance("Singleton 3").getValue());
    }
}
