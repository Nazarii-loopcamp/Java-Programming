package day05_variables;

public class MyName {

    public static void main(String[] args) {

        char letter1 = 'N';
        char letter2 = 'a';
        char letter3 = 'z';
        char letter4 = 'a';
        char letter5 = 'r';
        char letter6 = 'i';
        char letter7 = 'i';

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);
        System.out.println(letter6);
        System.out.println(letter7);

        System.out.println();

        // ADDITION
        System.out.println(letter1 + letter2 + letter3 + letter4 + letter5 + letter6 + letter7);

        String myName = "" + letter1 + letter2 + letter3 + letter4 + letter5 + letter6 + letter7;
        System.out.println(myName);

    }

}
