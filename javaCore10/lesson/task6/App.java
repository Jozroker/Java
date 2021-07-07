package mainPackage.javaCore10.lesson.task6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String stringText = sc.nextLine();
        stringText = stringText.trim();
        StringBuilder text = new StringBuilder(stringText);
        FindWord.FindWords(text);


    }
}
