package day42_b_maps.classroom;

// How the Object of this class will behave
public class Student {

    String name;
    int age;
    String ID;

    public Student(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "\nStudent Info: " +
                "\n\tname: " + name +
                "\n\tage: " + age +
                "\n\tID: " + ID;
    }
}
