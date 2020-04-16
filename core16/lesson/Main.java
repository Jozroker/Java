package mainPackage.core16.lesson;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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

            System.out.println(someDog.toString());
//            field.set(someDog, "black"); not access to field
            field.setAccessible(true);
            field.set(someDog, "black");
            System.out.println(someDog.toString());

            Method voice = someDog.getClass().getMethod("voice");
            voice.invoke(someDog);

            Method go = someDog.getClass().getMethod("go", int.class, String.class);
            Method go1 = someDog.getClass().getMethod("go", int.class);
            go1.invoke(someDog, 54);
            System.out.println();
            go.invoke(someDog, 54, "left");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
