package practice;

public class Money {

    public Money(){
        System.out.println("Default constructor");
    }

    public Money(int moneyAmount){
        System.out.println("2nd constructor define amount of money you want" + moneyAmount);
    }

    public static void buyCalculator(){
        Calculator calculator = new Calculator();
        /**
         *
         *  To access name variable form practice.Calculator class we need an practice.Calculator
         *  object/instance because that' a non static field. This in calculator class
         *  name is called Instance variable.
         *
         *  In  practice.Calculator class filed calculatorPrice is a static field or variable
         *  a static filed can be accessed without creating an object by the help
         *  of class name. That's why static field calculatorPrice is a Class Variable in
         *  practice.Calculator class
         *
         *  */
        String calculatorName = calculator.name;
        int priceOfCalculator = Calculator.calculatorPrice;
    }

}
