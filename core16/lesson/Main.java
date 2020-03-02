package mainPackage.core16.lesson;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog someDog = new Pitbul("Pit", 4, "white");
        System.out.println(someDog.toString());
        System.out.println("Class: " + someDog.getClass());
        System.out.println("Class name: " + someDog.getClass().getName());
        System.out.println("Class simple name: " + someDog.getClass().getSimpleName());
        System.out.println("Superclass: " + someDog.getClass().getSuperclass());
        System.out.println("Superclass simple name: " + someDog.getClass().getSuperclass().getSimpleName());
        System.out.println("Modifiers: " + someDog.getClass().getModifiers());
        System.out.println("Constructors: " + Arrays.toString(someDog.getClass().getConstructors()));
        System.out.println("Declared fields: " + Arrays.toString(someDog.getClass().getDeclaredFields()));
        System.out.println("Declared methods: " + Arrays.toString(someDog.getClass().getDeclaredMethods()));
        System.out.println("Fields: " + Arrays.toString(someDog.getClass().getFields()));
        System.out.println("Interfaces: " + Arrays.toString(someDog.getClass().getInterfaces()));
        System.out.println("Classes: " + Arrays.toString(someDog.getClass().getClasses()));
        System.out.println("Methods: " + Arrays.toString(someDog.getClass().getMethods()));
        try {
            System.out.println();
            Field field = someDog.getClass().getDeclaredField("color");
            System.out.println(field.getName());
            System.out.println(field.toString());
            System.out.println();

            Method method = someDog.getClass().getMethod("voice");
            System.out.println(method.toString());
            System.out.println();

            Constructor constructor = Pitbul.class.getConstructor(String.class, int.class);
            System.out.println(constructor.toString());
            System.out.println();

            System.out.println("Is interface: " + someDog.getClass().isInterface());
            System.out.println("Is local class: " + someDog.getClass().isLocalClass());
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
