package day38_a_abstraction_inheritance.animal;

// Concrete class / Non-Abstract class
public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dogs eat from bowl");
    }
}
