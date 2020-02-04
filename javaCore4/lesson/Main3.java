package mainPackage.javaCore4.lesson;

public class Main3 {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat", 3, 4);
        System.out.println(animal.toString());
        System.out.println();

        animal.setName("Dog");
        animal.setSpeed(7);
        animal.setAge(5);
        System.out.println(animal.toString());
    }
}
