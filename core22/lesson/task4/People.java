package mainPackage.core22.lesson.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class People {

    private String name;
    private int age;

    public People(String name) {
        this.name = name;
    }

    public People(String name, int age) {
        this(name);
        this.age = age;
    }

    public static void main(String[] args) {
        String[] names = {"Oleg", "Pavlo", "Denys"};
        List<String> namesList = new ArrayList<>(Arrays.asList(names));
        List<People> peoples = new ArrayList<>();
        namesList.forEach(name -> peoples.add(new People(name)));
        System.out.println(peoples);
        peoples.clear();
        namesList.forEach(name -> peoples.add(new People(name, namesList.indexOf(name))));
        System.out.println(peoples);

    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
