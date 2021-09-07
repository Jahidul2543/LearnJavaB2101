package problemsdemo;

public class FindFactorials {
    /**
     * factorials of n n! = 1 * 2 * 3 * ......* n
     * */

    public static void main(String[] args) {
        findFactorial();
    }

    private static void findFactorial() {
        int num = 50;
        int factorials =0;
        for (int i =1; i<num; i++){
            factorials =+ i;
        }
        System.out.println(factorials);
    }
}
