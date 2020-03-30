package mainPackage.core21.lesson.task1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CleanFile {

    public static void clean(File file) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write("".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
