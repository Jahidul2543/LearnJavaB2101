package stringdemo;

public class Students {

    String student1 = "Jack";
    String student2 = new String("Jack");

    public static void main(String[] args) {
        Students students = new Students();
        //students.getStudnetName();
        students.playWithString();
    }

    public void getStudnetName(){
        System.out.println(student1);
        System.out.println(student2);
    }

    public void playWithString(){

        String name = "";
        System.out.println("Length of the string: " +  name.length());
        System.out.println("Check is the name value is empty or not: " + name.isEmpty());


    }

}
