package mainPackage.javaCore10.lesson.task6;

public class CreateWordArray {

    public static String[] CreateArray(StringBuilder sb) {
        int count = CalculateQuantityWordOnText.quantityWords(sb);
        String[] arr = new String[count];
        StringBuilder word = new StringBuilder("");
        int value = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (i != sb.length()-1) {
                if (sb.charAt(i) == '.' && sb.charAt(i+1) == '.'
                        && sb.charAt(i+2) == '.') {
                    i += 2;
                    continue;
                }
            } else if (sb.charAt(i) == '.' || sb.charAt(i) == '!'
                    || sb.charAt(i) == '?') {
                if (i == sb.length()-1) {
                    arr[value] = new String(word);
                    break;
                }
                i++;
            }
            if (sb.charAt(i) == ' ') {
                if (sb.charAt(i+1) == '-') {
                    i += 1;
                } else {

                    arr[value] = new String(word);
                    value++;
                    word.delete(0, word.length());
                }
            } else if (i == sb.length()-1) {
                word.append(sb.charAt(i));

                arr[value] = new String(word);
                value++;
                word.delete(0, word.length());
            } else {
                word.append(sb.charAt(i));
            }


        }
        return arr;
    }
}
