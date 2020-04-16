package mainPackage.core22.lesson.task1;

public class Cat implements Pet {

    @Override
    public void voice() {
        Pet cat = () -> System.out.println("I'm cat - Meow Meow");
        cat.voice();
    }
}
