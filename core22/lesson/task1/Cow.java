package mainPackage.core22.lesson.task1;

public class Cow implements Pet {

    @Override
    public void voice() {
        Pet cow = () -> System.out.println("I'm cow - Mu Mu");
        cow.voice();
    }
}
