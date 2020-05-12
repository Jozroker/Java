package mainPackage.javaCore9.lesson.task_1;

public class WrongInputConsoleParametersException extends Exception {

    @Override
    public String getMessage() {
        return "WrongInputException\nValue is not detected. Enter correctly value";
    }
}
