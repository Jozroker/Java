package mainPackage.javaCore10.lesson.task5;

public class CalculateQuantityWordOnText {

    public static int quantityWords(StringBuilder text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
            if (text.charAt(i) == '-') {
                count--;
            }
        }
        return count;
    }
}
