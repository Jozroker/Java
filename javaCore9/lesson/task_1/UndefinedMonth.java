package mainPackage.javaCore9.lesson.task_1;

public class UndefinedMonth extends Exception {

    @Override
    public String getMessage(){
        System.out.println("UndefinedMonth\nEnter correct month");
        return null;
    }
}
