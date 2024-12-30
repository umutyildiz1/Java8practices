package Java8.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static Java8.streamapi.streampractices.Fruit.*;

public class streampractices {
    public static void main(String[] args) {
        //GOAL : manipulate the collections with order using pipeline
        // provide more readable and effective code

        List<Fruit> fruitBasket = List.of(APPLE, BANANA, APPLE , APPLE, ORANGE);

        //filter() : filter the elements of list by given condition -- return list items which provides the condition

        var filtered = fruitBasket.stream()
                .filter(fruit -> fruit.equals(BANANA))
                .collect(Collectors.toList());
        System.out.println("filtered : " + filtered);

        //anyMatch() :
        //allMatch() :
        //forEach() :
        //forEachOrdered() :
        //findAny() :
        //distinct() :
        //collect() :
        //findAny() :
        //dropWhile() :
        //flatMap() : vs map():
        //limit() :
        //map() :
        //noneMatch() :
        //peek() :
        //reduce() :
        //skip() :
        //sorted() :
        //takeWhile :
        //toArray vs toList() vs collect(Collectors.toList()) :















        //PRACTICE


        List<String> strings = List.of("Geek_First", "Geek_2", "Geek_2", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
        List<Integer> integers = List.of(8,9,5,34,23,6,73,4);

        //find first
        var firstString = strings.stream()
                .findFirst()
                .orElse("");
        var firstInteger = integers.stream()
                .findFirst()
                .orElse(-1);

        System.out.println(String.format("first elements : %s, %d",firstString, firstInteger));

        //find max and min
        var max1 = strings.stream()
                .max(Comparator.naturalOrder())
                .orElse("");

        var max = integers.stream()
                .max(Comparator.naturalOrder())
                .orElse(-1);

        System.out.println(String.format("biggest : %d, %s", max, max1));

        var min1 = strings.stream()
                .min(Comparator.naturalOrder())
                .orElse("");

        var min = integers.stream()
                .min(Comparator.naturalOrder())
                .orElse(-1);

        System.out.println(String.format("min : %d, %s", min, min1));

        var distinct = strings.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinct " + distinct);

















    }

    public enum Fruit{
        APPLE,
        BANANA,
        ORANGE

    }
}