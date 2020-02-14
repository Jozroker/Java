package mainPackage.javaCore12.lesson.task3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList {

    private Object[] objectArray = {};
    private String className;

    public MyArrayList(String className) {
        this.className = className;
    }

    public void add(Object o) {
        if (o.getClass().getSimpleName().equals(this.className)) {
            Object[] tmp = new Object[this.objectArray.length + 1];
            int i = 0;
            for (Object item : this.objectArray) {
                tmp[i++] = item;
            }
            tmp[tmp.length - 1] = o;
            this.objectArray = tmp;
        } else {
            throw new ClassCastException();
        }
    }

    public void remove(int i) {
        if (i > this.objectArray.length - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            Object[] tmp = new Object[this.objectArray.length - 1];
            int j = 0;
            for (Object item : this.objectArray) {
                if (item == this.objectArray[i]) {
                    continue;
                } else {
                    tmp[j++] = item;
                }
            }
            this.objectArray = tmp;
        }
    }

    public Object get(int i){
        return this.objectArray[i];
    }

    public String toString() {
        return Arrays.toString(objectArray);
    }
}
