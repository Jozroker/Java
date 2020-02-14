package mainPackage.javaCore12.lesson.task2;

public class UndefinedMonth extends Exception {

    @Override
    public String getMessage(){
        System.out.println("UndefinedMonth\nEnter correct month");
        return null;
    }
}
