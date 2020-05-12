package mainPackage.javaCore10.lesson.task5;

public class CreateWordArray {

    public static String[] createArray(String text) {
        int count = CalculateQuantityWordOnText.quantityWords(text);
        String[] arr = new String[count];
        StringBuilder word = new StringBuilder();
        int value = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (text.charAt(i + 1) == '-') {
                    i += 1;
                } else {

                    arr[value] = new String(word);
                    value++;
                    word.delete(0, word.length());
                }
            } else if (i == text.length() - 1) {
                word.append(text.charAt(i));

                arr[value] = new String(word);
                value++;
                word.delete(0, word.length());
            } else {
                word.append(text.charAt(i));
            }


        }
        return arr;
    }
}
