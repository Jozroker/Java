package mainPackage.javaCore10.lesson.task6;

import java.util.Arrays;

public class FindWord {

    public static void FindWords(StringBuilder sb) {
        String[] arr = CreateWordArray.CreateArray(sb);
        StringBuilder word = new StringBuilder();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int tmp = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    tmp++;
                }
            }
            if (tmp > count) {
                count = tmp;
                word = new StringBuilder(arr[i]);
            } else if (tmp == count) {
                word.append(", " + arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The most used word(s) is: " + word);
        System.out.println("It used " + count + " times");
    }
}
