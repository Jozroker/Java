package mainPackage.javaCore11.lesson.task2;

public class Engine {
    private int cylindersQuantity;

    public Engine(int cylindersQuantity) {
        this.cylindersQuantity = cylindersQuantity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylindersQuantity=" + cylindersQuantity +
                '}';
    }

    public void setCylindersQuantity(int cylindersQuantity) {
        this.cylindersQuantity = cylindersQuantity;
    }
}
