package mainPackage.javaCore11.lesson.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        boolean value = true;
        System.out.println("Input quantity array values");
        int quantity = sc.nextInt();
        Integer[] integers = new Integer[quantity];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = rd.nextInt(100);
        }
        Integer[] integers2 = integers.clone();

        while (value) {
            value = false;
            for (int j = 0; j < integers2.length - 1; j++) {
                if (integers2[j] < integers2[j + 1]) {
                    value = true;
                    int temp = integers2[j];
                    integers2[j] = integers2[j + 1];
                    integers2[j + 1] = temp;
                }
            }

        }

        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers2));
        System.out.println(Arrays.toString(integers));

    }
}
