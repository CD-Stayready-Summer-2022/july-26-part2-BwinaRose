package cd.get.ready.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        Map<String,Integer> numsDup = new HashMap<>();
        int count = 0;
        for (String s: input) {
            numsDup.merge(s, 1, Integer::sum);
        }
        for (Map.Entry entry : numsDup.entrySet()) {
            int value = (int) entry.getValue();
            if(value > 1){
                count++;
            }
        }
        return count;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){

        Map<Integer,Integer> numsDup = new HashMap<>();
        int count = 0;
        for (Integer n: input) {
            numsDup.merge(n, 1, Integer::sum);
        }
        for (Map.Entry entry : numsDup.entrySet()) {
            int value = (int) entry.getValue();
            if(value > 1){
                count++;
            }
        }
        return count;
    }
}
