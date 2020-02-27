package mainPackage.javaCore5.lesson.task2;
import java.util.Random;
public class Coin {
    private boolean value;
    private Random ran = new Random();

    public void setValue(){
        this.value = ran.nextBoolean();
    }

    public void getValue(){
        if (value){
            System.out.println("Орел");
        }
        else if (value){
            System.out.println("Решка");
        }
        else {
            System.out.println("Монета стала на ребро");
        }
    }
}
