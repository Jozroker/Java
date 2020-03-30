package mainPackage.core21.lesson.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = setFile();
        Student s1 = new Student("Oleg", "Pavlow", 18, 3);
        Student s2 = new Student("Vasyl", "Melnyk", 16, 1);
        Student s3 = new Student("Taras", "Demyan", 18, 4);

        ObjToFileWriter writer = new ObjToFileWriter();
        writer.writeObject(file, s1, s2, s3);

        fileRead(file);
//        CleanFile.clean(file);
//        fileRead(file);
    }

    private static File setFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input file name: ");
        String fileName = sc.next();
        return new File("F:\\PC_Educate\\Programming\\java\\newProject\\src\\mainPackage\\core21\\lesson\\task1\\" + fileName);
    }

    private static void fileRead(File file) {
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            while (fileInputStream.available() > 0) {
                System.out.print((char) fileInputStream.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
