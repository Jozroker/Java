package mainPackage.javaCore9.lesson.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = sc.nextInt();

        System.out.print("Input b: ");
        int b = sc.nextInt();

        try {
            Methods.add(a, b);
            Methods.subtraction(a, b);
            Methods.multiply(a, b);
            Methods.devide(a, b);
        } catch (MyException | ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
