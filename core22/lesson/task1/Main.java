package mainPackage.core22.lesson.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Cat());
        pets.add(new Cow());
        pets.add(new Dog());
        pets.forEach(Pet::voice);
    }
}
