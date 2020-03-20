package mainPackage.core19.lesson;

import java.io.*;

public class Methods {

    public static void serialize(File file, Object... o) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Object object : o) {
                objectOutputStream.writeObject(o);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object[] deserialize(File file) {
        Object[] objects = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            objects = (Object[]) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objects;
    }
}
