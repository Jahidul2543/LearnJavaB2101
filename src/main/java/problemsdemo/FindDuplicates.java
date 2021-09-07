package problemsdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    /**
     * Write Code To Filter Duplicate Elements From An Array?
     * */


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(Integer.valueOf(i));
        }
        for(int i=0; i<5; i++){
            list.add(Integer.valueOf(i));
        }
        System.out.println("List to process: " + list);
        System.out.println("Duplicate numbers  " + processList(list));
    }
    public static Set<Integer> processList(List<Integer> listToProcess) {
        Set<Integer> resultset = new HashSet<>();
        Set<Integer> tempSet = new HashSet<>();
        for (Integer i : listToProcess) {
            if (!tempSet.add(i)) {
                resultset.add(i);
            }
        }

              return resultset;
    }
}