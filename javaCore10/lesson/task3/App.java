package mainPackage.javaCore10.lesson.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        char[] sentence = sc.nextLine().trim().toCharArray();
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == ' ') {
                count++;
            }
            if (sentence[i] == '-') {
                count--;
            }
        }
        System.out.println("Sentence has " + count + " words");
    }
}
