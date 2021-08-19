package inheritancedemo;

public interface Symbian {
    public void call();
    public void sendText();
    //public void touchScreen();
    default public void neFeature(){
        System.out.println("This is a default method in Symbian Interface");
    };
}
