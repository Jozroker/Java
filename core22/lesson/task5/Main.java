package mainPackage.core22.lesson.task5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Amphibia frog = new Frog();
        List<Method> methods = Arrays.asList(frog.getClass().getMethods());
        methods.forEach(method -> {
            try {
                Amphibia.class.getMethod(method.getName()).invoke(frog);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ignore) {
            }
        });
    }
}
