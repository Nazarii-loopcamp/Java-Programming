package day14_string_methods;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Loopcamp";

        System.out.println(str.startsWith("Loop"));
        System.out.println(str.startsWith("loop"));
        System.out.println(str.toLowerCase().startsWith("loop".toLowerCase()));

    }
}
