package DesignPatterns.cretionalpatterns.abstractfactory;

import DesignPatterns.cretionalpatterns.abstractfactory.constants.ProductType;
import DesignPatterns.cretionalpatterns.abstractfactory.factories.FurniterFactory;
import DesignPatterns.cretionalpatterns.abstractfactory.factories.ModernFurnitureFactory;
import DesignPatterns.cretionalpatterns.abstractfactory.factories.VictorianFurnitureFactory;

import java.util.Scanner;

import static DesignPatterns.cretionalpatterns.abstractfactory.constants.ProductType.VICTORIAN;

public class Main {
    public static void main(String[] args) {
        // Abstract factory design patternını "birbirleri ile uyumlu birden fazla" nesnelerin oluşturulması olarak tanımlayabiliriz.
        //"Single responsibility" ve "open closed" prensiplerini sağlar.
        //Factory Method genellikle "tek bir türde nesne oluşturmak" için uygunken, Abstract Factory "bir dizi uyumlu ürün oluşturmak için" daha uygundur.

        Scanner scanner = new Scanner(System.in);
        ProductType expectedType = ProductType.valueOf(scanner.next());
        FurniterFactory furniterFactory = getFactory(expectedType);

        System.out.printf("Sofa : %s %n" , furniterFactory.createSofa().getType());
        System.out.printf("Chair : %s %n" , furniterFactory.createChair().getType());
    }
    private static FurniterFactory getFactory(ProductType type) {
        return type.equals(VICTORIAN)  ? new VictorianFurnitureFactory() : new ModernFurnitureFactory() ;
    }
}