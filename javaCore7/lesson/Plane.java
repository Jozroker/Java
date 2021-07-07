package mainPackage.javaCore7.lesson;
import java.util.Random;
public abstract class Plane{
    private int length;
    private int width;
    private int weight;
    public PlaneControl control;

    Random random = new Random();

    public Plane(int length, int width, int weight, PlaneControl control){
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.control = control;

    }

    public void startEngine(){
        System.out.println("Start engines..."+(random.nextInt(69)+20)+" second to take off");
    }

    public void takeOff(){
        System.out.println("Plane take off");
        System.out.printf("Kilometers to left fuel: %.2f\n",random.nextDouble()*1000);
    }

    public void landing(){
        System.out.println("Plane is landing...");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public void moveUp(){
        control.moveUp();
    }

    public void moveDown(){
        control.moveDown();
    }

    public void moveLeft(){
        control.moveLeft();
    }

    public void moveRight(){
        control.moveRight();
    }

}
