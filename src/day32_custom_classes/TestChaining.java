package day32_custom_classes;

public class TestChaining {
    // Runner Class
    public static void main(String[] args) {

        ChainExample obj1 = new ChainExample();

        System.out.println("---");
        new ChainExample(2);

        System.out.println("---");
        new ChainExample("Loopcamp");

        System.out.println("---");
        new ChainExample(12.12);

    }
}
