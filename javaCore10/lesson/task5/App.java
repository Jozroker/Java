package mainPackage.javaCore10.lesson.task5;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String stringText = sc.nextLine();
        stringText = stringText.trim();
        StringBuilder text = new StringBuilder(stringText);
        String word = FindWord.findWords(stringText);
        System.out.println("The most used word(s) is: " + word);
    }
}
