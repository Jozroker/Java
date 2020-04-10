package mainPackage.core22.lesson.task1;

public class Dog implements Pet{

    @Override
    public void voice() {
        Pet dog = () -> System.out.println("I'm dog - Gav Gav");
        dog.voice();
    }
}
