package problemsdemo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries(100);
    }

    private static void fibonacciSeries(int n) {

        int t1 = 0; int t2 = 1;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=n; i++){
           // System.out.print(t1 + ", ");
            list.add((Integer)t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        list.forEach(integer -> System.out.print(integer + ", "));
    }

}
