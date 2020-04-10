package mainPackage.core23.lesson.task2;

import java.util.Objects;

public class Animal {

    private String name;
    private String type;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "    Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                "}";
    }
}
