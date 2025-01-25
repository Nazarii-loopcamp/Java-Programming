package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {
    public static void main(String[] args) {

        ArrayList <String> numsAsString = new ArrayList<>(Arrays.asList("123", "34", "513"));
        System.out.println("Original: " + numsAsString);

        System.out.println(sumOfElemFromString(numsAsString));

    }

    public static ArrayList <Integer> sumOfElemFromString (ArrayList <String> nums) {

        ArrayList <Integer> resultList = new ArrayList<>();

        for (String each : nums) {
            // System.out.println(each);

            int sumAll = 0;
            for (String eachLetter : each.split("")) {
                sumAll += Integer.parseInt(eachLetter);
            }
            resultList.add(sumAll);
        }

        return resultList;
    }

}
