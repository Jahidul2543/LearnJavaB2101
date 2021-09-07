package problemsdemo;

public class FindPrimeNumber {
    public static void main(String[] args) {
       int numberToCheck = 4;
        if (findPrime(numberToCheck)) {
            System.out.println("Input value " + numberToCheck + " is a prime number.");
        } else {
            System.out.println("Input value " + numberToCheck
                    + " is not a prime number.");
        }
    }

    private static boolean findPrime(int numberToCheck){

        if(numberToCheck<=1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(numberToCheck); i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }
}
