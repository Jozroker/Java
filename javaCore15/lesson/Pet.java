package mainPackage.javaCore15.lesson;

import java.util.Objects;

public class Pet {
    private String type;
    private String name;

    public Pet(AnimalType type, String name) {
        this.type = type.toString().toLowerCase();
        this.name = name;
    }

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "\n  Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
