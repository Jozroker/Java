package mainPackage.javaCore12.lesson.task1;

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
