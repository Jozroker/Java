package mainPackage.javaCore10.lesson.task4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        StringBuilder text = new StringBuilder(sc.nextLine());
        for (int i = 0; i < text.length(); i++){
            if (i != text.length()-1) {
                if (text.charAt(i) == '.' && text.charAt(i+1) == '.'
                    && text.charAt(i+2) == '.') {
                    count++;
                    i += 2;
                    continue;
                }
            }
            if (text.charAt(i) == '.' || text.charAt(i) == '!'
                || text.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("Text has " + count + " sentences");
    }
}
