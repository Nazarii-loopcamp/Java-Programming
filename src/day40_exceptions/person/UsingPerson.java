package day40_exceptions.person;

public class UsingPerson {
    public static void main(String[] args) {

        Person person = new Person();
        try {
            person.setName("");
        }catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

        // person.setName("Tom");

        person.setAge(20);
        System.out.println(person.getAge());
        try {
            person.setAge(-10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(person.getAge());

    }
}
