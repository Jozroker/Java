package mainPackage.core21.lesson.task1;

public class Person {

    @WriteToFile(type=("first name"))
    private String firstName;
    @WriteToFile(type=("last name"))
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
