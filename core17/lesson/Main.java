package mainPackage.core17.lesson;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection(4,8,15,0,2);
        System.out.println(Arrays.toString(collection.getNumbers()));
        System.out.println();

        collection.getNumbersWithNormalIterator();
        System.out.println(Arrays.toString(collection.getNumbers()));
        System.out.println();

        collection.getNumbersWithReverseIterator();
        System.out.println(Arrays.toString(collection.getNumbers()));
        System.out.println();

        collection.getAnonymousClass();

        collection.getLocalClass();

        Collection.Nested nested = new Collection.Nested();
        nested.getNestedClass();
    }
}
