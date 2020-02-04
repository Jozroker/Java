package mainPackage.javaCore7.lesson;
import java.util.Random;
public class PlaneControl {
    Random random = new Random();
    public final void moveUp(){
        System.out.println("Plane move up by "+(random.nextInt(100)+1)+" meters");
    }

    public final void moveDown(){
        System.out.println("Plane move down by "+(random.nextInt(100)+1)+" meters");
    }

    public final void moveLeft(){
        System.out.println("Plane move left by "+(random.nextInt(100)+1)+" meters");
    }

    public final void moveRight(){
        System.out.println("Plane move right by "+(random.nextInt(100)+1)+" meters");
    }



}
