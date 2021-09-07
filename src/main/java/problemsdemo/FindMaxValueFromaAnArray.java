package problemsdemo;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValueFromaAnArray {
    public static void main(String[] args) {
        int[] array = {1, 2,3, 5, 24,1,23};
        List<Integer> list = new ArrayList<>();

        /**
         * Creating a list
         *
         * */
        for(int i = 0; i<20; i++ ){
            list.add(Integer.valueOf(i));
        }

        sortTwoMaxValueFromArray(array);
        sortTwoMaxValueFromList(list);
    }

    private static void sortTwoMaxValueFromArray(int[] array){
        int max1 = 0;
        int max2 = 0;

        for (int i : array) {

            if(max1<i){
                max2 = max1;
                max1 = i;
            }
            else if(max2 < i){
                max2 = i;
            }
        }

        System.out.println("Max1: " + max1 + " and Max2: " + max2);
    }

    private static void sortTwoMaxValueFromList(List<Integer> list){
        Integer max1 =0;
        Integer max2 =0;

        for(Integer i : list){
            if(max1<i){
                max2 = max1;
                max1 = i;
            }
            else if(max2<i){
                max2 = i;
            }
        }

        System.out.println("Max1: " + max1 + " and Max2: " + max2);
    }

}
