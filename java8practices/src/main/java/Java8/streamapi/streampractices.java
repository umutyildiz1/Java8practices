package Java8.streamapi;

import java.time.Duration;
import java.time.Instant;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static Java8.streamapi.streampractices.Fruit.*;

public class streampractices {
    public static void main(String[] args) {
        //GOAL : manipulate the collections with order using pipeline
        // provide more readable and effective code

        //Difference between stream and parallel stream is multithreading
        // stream executes only one thread and it guarantees the sequence --> less memory usage
        // parallel stream executes multi thread and it doesnt guarantee the sequence --> useful for big data
        // dont use "stateful" processes with parallel stream !!!! because of performance

        List<Fruit> fruitBasket = List.of(APPLE, BANANA, APPLE, APPLE, ORANGE);
        List<String> nums = List.of("1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3", "4", "5");

        //filter() : filter the elements of list by given condition -- return list items which provides the condition

        var filtered = fruitBasket.stream()
                .filter(fruit -> fruit.equals(BANANA))
                .collect(Collectors.toList());
        System.out.println("filtered : " + filtered);

        //anyMatch() : if any elements provides the condition for matching return true, else false

        Boolean result = fruitBasket.stream()
                .anyMatch(fruit -> fruit.equals(MELON));
        System.out.println("anyMatch() : " + result);

        //allMatch() : all elements must match with given condition --> return true, else false
        //noneMatch() : no elements must match with given condition --> return true, else false

        result = fruitBasket.stream()
                .allMatch(fruit -> !fruit.equals(MELON));
        System.out.println("allMatch() : " + result);

        //same business

        result = fruitBasket.stream()
                .noneMatch(fruit -> fruit.equals(MELON));
        System.out.println("noneMatch() : " + result);

        //forEach() :
        fruitBasket.stream()
                .forEach(fruit -> System.out.println("forEach fruit : " + fruit));

        //forEachOrdered() :

        fruitBasket.stream()
                .forEachOrdered(fruit -> System.out.println("forEachOrdered fruit : " + fruit));

        //difference between forEach() and forEachOrdered() is sequence.
        //when parallel stream is used, forEach is not guarantee the sequence but forEachOrdered is .
        System.out.println("*****************************");
        System.out.println("Difference between ForEach and ForEachOrdered");
        System.out.println("Base list : " + fruitBasket);

        fruitBasket.parallelStream()
                .forEach(fruit -> System.out.println("forEach fruit : " + fruit));
        System.out.println("**************");
        fruitBasket.stream()
                .forEachOrdered(fruit -> System.out.println("forEachOrdered fruit : " + fruit));


        System.out.println("*****************************");

        //distinct() :

        Instant a = Instant.now();
        var list = fruitBasket.stream()
                .distinct()
                .collect(Collectors.toList());
        Instant b = Instant.now();
        System.out.println(String.format("distinct() list : %s, time : %d", list, Duration.between(a, b).toMillis()));

        a = Instant.now();
        var list1 = fruitBasket.parallelStream()
                //.sequential() improve the performance for distinct() when parallel stream is used
                .distinct()
                .collect(Collectors.toList());
        b = Instant.now();
        System.out.println(String.format("distinct() parallel list : %s, time : %d", list1, Duration.between(a, b).toMillis()));
        System.out.println("*****************************");

        //findAny() : returns an Optional with random item from list

        var item = fruitBasket.stream()
                .findAny();
        System.out.println("findAny() sequential item : " + item.get());

        item = fruitBasket.parallelStream()
                .findAny();
        System.out.println("findAny() parallel item : " + item.get());

        //findAny() is more fast when parallel stream is used because it returns a random item
        //but when parallel stream is used, findFirst tries to find first item of list
        //on the other hand there is no significant performance difference between findFirst() and findAny()
        //when sequential stream is used

        System.out.println("*****************************");

        //limit() :
        list = fruitBasket.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("limit() sequential list : " + list);

        System.out.println("*****************************");

        //flatMap() : vs map():
        //flatmap is used for transformation and flatten nested lists includes sub streams
        //but map is used for only transformation of streams

        List<List<String>> nested = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("F", "G")
        );

        var q = nested.stream()
                .map(n -> n.stream())
                .collect(Collectors.toList());
        System.out.println("map -> " + q);

        var w = nested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("flatMap -> " + w);

        System.out.println("*****************************");

        //peek() : peek is used for debugging the stream
        // should not change the datas of stream
        AtomicInteger counter = new AtomicInteger();
        fruitBasket.stream()
                .peek(ab -> {
                    counter.getAndIncrement();
                    System.out.println("Peek Item : " + ab);
                })
                .collect(Collectors.toList());
        System.out.println("*****************************");
        //reduce() :
        //combine elements with a process such as addition subtraction or string concatenation get only one result
        var result1 = nums.stream()
                .reduce(String::concat);
        System.out.println("sequential result : " + result1.get());
        var result2 = nums.parallelStream()
                .peek(System.out::print)
                .reduce("", String::concat, (y, u) -> y + u);
        System.out.println("parallel result : " + result2);
        System.out.println("isEqual : " + result1.get().equals(result2));//base order is protected because
        //despite threads, reduce saves the order
        System.out.println("*****************************");

        //skip() :
        long start = System.currentTimeMillis();
        var list2 = nums.stream()
                .skip(9)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println(String.format("skip sequential : %s",list2));
        System.out.println(String.format("skip sequential : %d", end-start));
        start = System.currentTimeMillis();
        var list3 = nums.parallelStream()
                .skip(9)
                .collect(Collectors.toList());
        end = System.currentTimeMillis();
        System.out.println(String.format("skip parallel : %s",list3));
        System.out.println(String.format("skip parallel : %d",end-start));
        //stateful operations should not use with parallel streams!! because of performance and consistency

        //sorted() :
        System.out.println("*****************************");
        //dropWhile() :
        //takeWhile :
        //collect() :
        //unordered():
        //ordered():
        //sequential():
        //mapMulti()
        //toArray vs toList() vs collect(Collectors.toList()) :
        //ordered parallel pipelines, ?  difference between sequential vs ordered ?


        //PRACTICE

        System.out.println("**************PRACTICESSS***************");
        List<String> strings = List.of("Geek_First", "Geek_2", "Geek_2", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
        List<Integer> integers = List.of(8, 9, 5, 34, 23, 6, 73, 4);

        //find first
        var firstString = strings.stream()
                .findFirst()
                .orElse("");
        var firstInteger = integers.stream()
                .findFirst()
                .orElse(-1);

        System.out.println(String.format("first elements : %s, %d", firstString, firstInteger));

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

    public enum Fruit {
        APPLE,
        BANANA,
        ORANGE,
        MELON

    }
}