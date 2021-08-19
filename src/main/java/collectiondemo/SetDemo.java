package collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        setDemo();
        SetDemo setDemo = new SetDemo();
        String className = setDemo.getClass().toString();
        System.out.println(className);
        // Find a way to split by .
        String[] splitedString = className.split(" ");
        System.out.println(splitedString.length);
    }

    public static void setDemo(){
        Set<Integer> phoneNumber = new HashSet<>();
        phoneNumber.add(12345);
        phoneNumber.add(2345);
        phoneNumber.add(3456788);
        phoneNumber.add(465758);
        phoneNumber.add(12233); // 5 elements 1 duplicate
        System.out.println(phoneNumber.size());

        // -> lambda sign
        for ( Integer number: phoneNumber ) {
            System.out.println(number);
        }
       // phoneNumber.forEach(numb -> System.out.println(numb));
        phoneNumber.forEach(number -> System.out.println("Phone Number: " + number));

    }
}
