package collectiondemo;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Students {

    public static void main(String[] args) {
            createStudentList();
    }

    public static void createStudentList(){

        List<String> studentList = new ArrayList<>(); // Length?? -->

        System.out.println("Array List length: " + studentList.size());
        studentList.add("Jack");
        studentList.add("John");
        studentList.add("Jakob");
        studentList.add("Jadid");
        studentList.add("Json");
        studentList.add("Justin");
        studentList.add("Jenifer");
        studentList.add("Jeny");
        studentList.add("Jim");
        studentList.add("Jerry");
        studentList.add("Jainalabedin");

        System.out.println("Array List length: " + studentList.size());
        List<String > elementWith4Character = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            //int lenghtOfTheElement = studentList.get(i).length();
            if(studentList.get(i).length() == 4){
                //System.out.println(studentList.get(i));
                elementWith4Character.add(studentList.get(i));
                //System.out.println("Total elements with 4 characters: " + elementWith4Character.size());
            }
            //System.out.println("Total elements with 4 characters: " + elementWith4Character.size());
            //System.out.println("Value of index " + i + " : " + studentList.get(i));
        }
        System.out.println("Total elements with 4 characters: " + elementWith4Character.size());
        System.out.println("Start of foreach loop");
        for( String name : studentList ){
            //System.out.println(name);
            // Remove any items other than size 4
            if(name.length() != 4){
                try {
                    studentList.remove(name);
                }
                catch (ConcurrentModificationException concurrentModificationException){
                    System.out.println(concurrentModificationException.getMessage());
                }
            }
        }
        System.out.println("New List length with element size 4 after remove operation: " + studentList.size()  );
    }
}
