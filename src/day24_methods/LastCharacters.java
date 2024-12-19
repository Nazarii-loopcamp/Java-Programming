package day24_methods;

import java.util.Arrays;

public class LastCharacters {
    public static void main(String[] args) {

        String [][] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
        };

        System.out.println(Arrays.deepToString(words));

        for (String[] eachSingleArr : words) {
            String lastChars = "";

            for (String eachELem : eachSingleArr) {
                lastChars += eachELem.charAt(eachELem.length() - 1);
            }
            System.out.println(lastChars);
        }

        /*
            TODO: Practice
                Implement the same code with traditional loop: fori
         */

    }
}
