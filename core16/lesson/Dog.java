package mainPackage.core16.lesson;

public class Dog {

    private final static int LEGS = 4;
    private String name;
    private int age;
    private String state = "lie";

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setStateStand() {
        this.state = "stand";
    }

    public void setStateLie() {
        this.state = "lie";
    }

    public void setStateSit() {
        this.state = "sit";
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", state='" + state + '\'' +
                '}';
    }
}
