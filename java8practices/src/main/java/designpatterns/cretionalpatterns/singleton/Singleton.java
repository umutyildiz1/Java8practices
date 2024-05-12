package DesignPatterns.cretionalpatterns.singleton;

public class Singleton {

    private static Singleton instance;
    private String value;

    private Singleton(String value) {//private constructor
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if (instance == null)
            instance = new Singleton(value);

        return instance;
    }

    public String getValue(){
        return value;
    }
}
