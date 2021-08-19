package inheritancedemo;

public final class N1100 extends Pre1100{
    /**
     * How many methods N1100 class own? 3/3/3
     *
     * */
    // When final used before a variable that value cant be changed
     final static int x = 10;


    public static void main(String[] args) {
        N1100 n1100 = new N1100();
        n1100.createPhoneBook();
        n1100.call();
        n1100.sendText();
        int price = n1100.price;
        System.out.println(price);
        createPhoneBook(200);
        getX();

    }
//    public void display(){
//        System.out.println("Nice Display");
//        System.out.println("We are overriding display() method");
//    }

    public void createPhoneBook(){
        System.out.println("Phone Book");
    }

    public static void createPhoneBook(int maxSizeOfPhoneBook){
        System.out.println("Max Number can be stored: " + maxSizeOfPhoneBook);
        System.out.println("I am over loaded method");
    }

//    public void display(){
//        System.out.println("Nice Display");
//    }

    public static void getX(){
        //x = 20;
        int y = x;
        System.out.println(y);
    }



}
