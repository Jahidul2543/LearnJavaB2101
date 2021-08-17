package practice;

public class Light {

    /**
     * Components of a class
     * 1. Constructor
     * 2. Method
     * 3. Main Method (Not mandatory)
     * 4. Object
     * 5. Variables
     * */

    /**
     *
     *  Default constructor
     *  Does not have any return type
     *  Name of the constructor is same as Class Name
     *
     * */
    public Light(){
        System.out.println("I am default constructor, I can help you to create an object");
    }

    public static void main(String[] args) {

        // Create a practice.Light Object
        // Using new keyword we are invoking practice.Light constructor to create a practice.Light Object
        Light myTableLight = new Light(); // Hidden(Default) Constructor in a class looks like ClassName()
        // Yea we have object, can we turn on or off?
        myTableLight.onOffLight("on");

    }

    public void onOffLight(String expectedLightState){
        /**
         * if (condition){
         *     // If the condition is true execute anything inside the block if not skip
         *  }
         *
         * */
        // Declaration of a variable a
        int a;
        a = 2;
        int b = a +2;

        // State of the light
        //boolean isLightOn = lightState; // true

        String desiredLightState = expectedLightState;
        // isLightOn = true  -- > invert the value true ---> false (!ture)

        if ( desiredLightState == "on"){
            System.out.println("Turn On practice.Light");
            System.out.println("practice.Light Turned On");
        }
        else if ( desiredLightState == "off"){
            System.out.println("Turn Off practice.Light");
            System.out.println("practice.Light Turned Off");
        }
    }

    public void turnOnLight(){
        System.out.println("Turn On practice.Light");
        System.out.println("practice.Light Turned On");
    }

    public void turnOffLight(){
        System.out.println("Turn Off practice.Light");
        System.out.println("practice.Light Turned Off");
    }

    public void increaseLight(){
        System.out.println("Increase practice.Light by 50%");
        System.out.println("practice.Light increased by 50%");
    }

}
