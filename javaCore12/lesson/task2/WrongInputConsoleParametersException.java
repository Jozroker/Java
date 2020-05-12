package mainPackage.javaCore12.lesson.task2;

public class WrongInputConsoleParametersException extends Exception {

    public String getMessage() {
        return "WrongInputException\nValue is not detected. Enter correctly value";
    }
}
