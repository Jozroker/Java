package mainPackage.javaCore5.lesson.task4;

public class Overloading {
    private int value1;
    private int value2;
    private int value3;

    public Overloading(int value1, int value2){
        this.value1 = value1;
        this.value2 = value1;
    }

    public Overloading(int value1, int value2, int value3){
        this(value1, value2);
        this.value3 = value3;
    }
}
