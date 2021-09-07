package math;

public class Fibonacci {
    public static void main(String[] args) {
        /*
          Write 40 Fibonacci numbers with java.
         */
        int i = 1;
        int j = 0;

        System.out.print("40 Fibonacci numbers: ");

        for (int k = 1; k <= 40; k++) {
            int sum = i + j; // (1+0)(0+1)(1+1)(1+2)(2+3)
            i = j;           //i = 0/ i=1/ i=1/2/3
            j = sum;         // 1/ 1/ 2/3/5
            System.out.print(sum + " ");// 1, 1, 2, 3, 5
        }
    }

}
//1, 1,2
// 1 & 0

