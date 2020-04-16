package mainPackage.javaCore10.lesson.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        try {
            String word = sc.nextLine();
            if (word.length() != 5) {
                throw new WordLengthException("Word length not correct! Enter word from 5 chars");
            }
            if (word.toLowerCase().charAt(0) == word.toLowerCase().charAt(4)
                    && word.toLowerCase().charAt(1) == word.toLowerCase().charAt(3)) {
                System.out.println("This word is polindrome");
            } else {
                System.out.println("This word isn't polindrome");
            }
        } catch (WordLengthException e) {
            System.out.println(e.getMessage());
        }

    }
}
