package mainPackage.javaCore14.lesson.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Users> users = new HashSet<>();
        users.add(new Users("Jack", 34));
        users.add(new Users("Nick", 28));
        users.add(new Users("Tom", 14));
        users.add(new Users("Rick", 30));
        users.add(new Users("Chack", 42));
        System.out.println(users.toString());
        System.out.println();

        Set<Users> users2 = new TreeSet<>(users);
        System.out.println(users2);
        System.out.println();

        AgeComparator ageComparator = new AgeComparator();
        NameComparator nameComparator = new NameComparator();

        System.out.println("Sorted by age: ");
        Set<Users> users3 = new TreeSet<>(ageComparator);
        users3.add(new Users("Jackk", 18));
        users3.add(new Users("Nickk", 25));
        users3.add(new Users("Tomm", 58));
        users3.add(new Users("Rickk", 28));
        users3.add(new Users("Chackk", 38));
        System.out.println(users3.toString());
        System.out.println();

        System.out.println("Sorted by name: ");
        Set<Users> users4 = new TreeSet<>(nameComparator);
        users4.add(new Users("Jackk", 18));
        users4.add(new Users("Nickk", 25));
        users4.add(new Users("Tomm", 58));
        users4.add(new Users("Rickk", 28));
        users4.add(new Users("Chackk", 38));
        System.out.println(users4.toString());
        System.out.println();

        System.out.println("Sorted list by age: ");
        List<Users> users5 = new ArrayList<>(users4);
        users5.sort(new AgeComparator());
        System.out.println(users5.toString());

    }
}
