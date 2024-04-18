package Java8.methodreference;

import java.util.ArrayList;
import java.util.List;

public class methodreferencepractice {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(Boolean.FALSE, Boolean.FALSE));
        users.add(new User(Boolean.FALSE, Boolean.FALSE));
        users.add(new User(Boolean.TRUE, Boolean.TRUE));
        users.add(new User(Boolean.TRUE, Boolean.TRUE));

        List<String> strings = new ArrayList<>();
        strings.add("true");
        strings.add("false");
        Boolean result;

        //Method reference can be used as a shorter and more readable alternative for a lambda expression
        // that only calls an existing method

        //pattern --> Class::methodName

        //4 usages

        //Reference to a Static Method
        System.out.println("------------------------------------");
        System.out.println("Reference to a Static Method");
        //result = users.stream().anyMatch(user -> User.isReal(user)); -- long way
        result = users.stream().anyMatch(User::isReal);//-- Readable way

        System.out.println(result);


        //Reference to an Instance Method
        System.out.println("------------------------------------");
        System.out.println("Reference to an Instance Method");

        //result = users.stream().anyMatch(user -> user.isTall()); -- long way
        result = users.stream().anyMatch(User::isTall);

        System.out.println(result);

        //Reference to an Instance Method of an Object of a Particular Type
        System.out.println("------------------------------------");
        System.out.println("Reference to an Instance Method of an Object of a Particular Type");

        //result = strings.stream().anyMatch(string -> Boolean.parseBoolean(string)); -- long way
        result = strings.stream().anyMatch(Boolean::parseBoolean);

        System.out.println(result);
        //Reference to a Constructor
        //(User::new)
    }
}
