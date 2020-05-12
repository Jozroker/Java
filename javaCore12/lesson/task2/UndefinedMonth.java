package mainPackage.javaCore12.lesson.task2;

public class UndefinedMonth extends Exception {

    @Override
    public String getMessage() {
        return "UndefinedMonth\nEnter correct month";
    }
}
