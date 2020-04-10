package mainPackage.core22.lesson.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static ArrayList<Integer> generate(int count) {
        Random rd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arr.add(rd.nextInt(2));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input throw count: ");
        int count = sc.nextInt();
        List coin = generate(count);
        coin.forEach(x -> {
            if ((int) x == 0) {
                System.out.println("Orel");
            } else {
                System.out.println("Reshka");
            }
        });
    }
}
