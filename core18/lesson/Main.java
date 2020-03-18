package mainPackage.core18.lesson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List list2 = new ArrayList();
        list.add(5);
        list.add(3);
        addToList(list, "name");
        System.out.println(list);

        list2.add(5);
        list2.add("name");
        System.out.println(list2);

        Map<Integer, String> map = new Map<>();
        map.add(1, "s1");
        map.add(2, "s2");
        System.out.println(map.toString());
        System.out.println();

        map.removeFromKey(1);
        System.out.println(map.toString());
        map.add(1, "s3");
        System.out.println(map.toString());
        System.out.println();

        map.getKeys();
        System.out.println();
        map.getValues();
        System.out.println();
        System.out.println(map.toString());
    }

    public static void addToList(List list, String str) {
        list.add(str);
    }
}
