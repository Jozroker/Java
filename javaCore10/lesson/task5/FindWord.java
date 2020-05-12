package mainPackage.javaCore10.lesson.task5;

public class FindWord {

    public static String findWords(String text) {
        String[] arr = CreateWordArray.createArray(text);
        StringBuilder word = new StringBuilder();
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int tmp = 0;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i].equals(arr[j])) {
                    tmp++;
                }
            }
            if (tmp > count) {
                count = tmp;
                word = new StringBuilder(arr[i]);
            } else if (tmp == count) {
                word.append(", " + arr[i]);
            }
        }
        return String.valueOf(word);
    }
}
