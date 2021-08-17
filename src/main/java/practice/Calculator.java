package practice;

public class Calculator {
    // Instance variable
   final String name = "Casio";
   final String url = "izaan.io";
   static int calculatorPrice = 24;

    public static void main(String[] args) {
       // System.out.println("Sum: " + add(2, 2));
       // System.out.println("Division: " + division(4, 0));
        // You are using wrong value, use non zero value

       // int result = division(4, 0);
        /**
         * Consume result
         *
         * */
        Calculator calculator = new Calculator();
         String calculatorName =  calculator.getCalculatorName();

        System.out.println("My practice.Calculator name: " + calculatorName);

    }

    public static int add(int a, int b){
      int  result = a + b ;

      return result;
    }

    public static int division(int a, int b){
         int c = 4;
         int result = 0;
         int hashCode = 0;

        /**
         *  java.lang.ArithmeticException
         * */
        // This is the line where problem may persist
        try {
             result = a / b;
            return result;
        }
        catch (ArithmeticException arithmeticException){
//            System.out.println(arithmeticException.getMessage());
//            System.out.println("You are using wrong value, use non zero value");
            String message = arithmeticException.getMessage();
            hashCode =  arithmeticException.hashCode();
            return hashCode;
        }
        catch (Exception exception){
            System.out.println("2nd catch block: " + exception.getStackTrace());
        }
        finally {
            /**
             *
             * Finally block of code executes anything happens with the code ein try, catch block
             * */
            System.out.println("Finally I learned what is try catch finally block in Java");
        }
        System.out.println("Result: " + result);
        return result;
    }

    public String  getCalculatorName(){
        String calculatorName = this.name;
       return calculatorName;
    }

    public String  modifyCalculatorName(){
        int modelName = 900;
         String name = this.name + modelName;
        return name;
    }
}
