package mainPackage.core21.lesson.task1;

public class Student extends Person {

    @WriteToFile(type=("course"))
    private int course;

    public Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }
}
