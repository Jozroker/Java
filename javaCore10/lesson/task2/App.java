package mainPackage.javaCore10.lesson.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        char[] letters = {'a', 'e', 'u', 'i', 'o', 'A', 'E', 'U', 'I', 'O'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text:");
        StringBuffer text = new StringBuffer(sc.nextLine());

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (text.charAt(i) == letters[j]) {
                    text.setCharAt(i, '-');
                }
            }
        }

        System.out.println(text);
    }
}
