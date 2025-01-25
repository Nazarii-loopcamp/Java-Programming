package day40_exceptions.person;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        // this.name = name;
        if (name.isBlank() || name.isEmpty()) {
            throw new Exception("Invalid name");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // this.age = age;
        if (age < 0) {
            throw new RuntimeException("Invalid age!");
        } else {
            this.age = age;
        }
    }

}
