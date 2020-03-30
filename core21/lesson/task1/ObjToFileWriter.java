package mainPackage.core21.lesson.task1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ObjToFileWriter {

    public void writeObject(File file, Object... objects) {
        for (Object o : objects) {
            Map<String, String> valueMap = new HashMap<>();
            Class<?> objClass = o.getClass();
            while (objClass != null) {
                for (Field field : objClass.getDeclaredFields()) {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(WriteToFile.class)) {
                        try {
                            valueMap.put(field.getAnnotation(WriteToFile.class).type(), field.get(o).toString());
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }

                objClass = objClass.getSuperclass();
            }
            try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
                String result = valueMap.entrySet().stream().map(entry -> {
                    return entry.getKey() + ":" + entry.getValue();
                }).collect(Collectors.joining(", ")) + ";\n";
                fileOutputStream.write(result.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
