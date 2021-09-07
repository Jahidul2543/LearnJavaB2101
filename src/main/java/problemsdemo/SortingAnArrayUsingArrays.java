package problemsdemo;

import java.util.Arrays;

public class SortingAnArrayUsingArrays {
    public static void main(String[] args) {
        String[] array = {"Jan", "Mar", "Feb", "apr", "May", "June", "July"};
        printArray(array, "Array to be sorted");
        /**
         * Using methods from Arrays class to sort array
         *
         * */
        Arrays.sort(array);
        printArray(array, "sort()");

        Arrays.sort(array, 0,2);
        printArray(array, "Sort a range of indexes");

        Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);
        printArray(array, "Sort in case insensitive order");

    }

    public static void printArray(String[] array, String methodDescription){
        System.out.println("Sorted using "+methodDescription );
        for(String str : array){
            System.out.println(str);
        }
    }
}
