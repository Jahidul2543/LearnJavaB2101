package inheritancedemo;

public abstract class Pre1100 implements Symbian, Symhock {
    int price = 100;
    public void call(){
        System.out.println("Make Call");
    }
    public void sendText(){
        System.out.println("Send text");
    }

    public final void display(){
        System.out.println("Nice Display");
    }

    public abstract void createPhoneBook();
}
