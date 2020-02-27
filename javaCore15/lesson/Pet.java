package mainPackage.javaCore15.lesson;

public class Pet {
    private String type;
    private String name;

    public Pet(AnimalType type, String name) {
        this.type = type.toString().toLowerCase();
        this.name = name;
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
