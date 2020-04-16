package mainPackage.core16.lesson;

public class Pitbul extends Dog implements Animal {

    private String color;


    public Pitbul(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public Pitbul(String name, int age) {
        super(name, age);
    }

    public void voice() {
        System.out.println("Woof...");
    }

    @Override
    public String toString() {
        return "Pitbul{" + super.toString() +
                ", color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go(int meter) {
        System.out.println("Dog went " + meter + " meters");
    }

    public void go(int meter, String turn) {
        System.out.println("Dog went " + meter + " meters");
        System.out.println("Dog turn " + turn);
    }
}
