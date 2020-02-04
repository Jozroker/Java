package mainPackage.javaCore5.lesson.task2;
import java.util.Random;
public class Coin {
    private int value;
    private Random ran = new Random();

    public void setValue(){
        int random = ran.nextInt(2);
        this.value = random;
    }

    public void getValue(){
        if (value == 0){
            System.out.println("Орел");
        }
        else if (value == 1){
            System.out.println("Решка");
        }
        else {
            System.out.println("Монета стала на ребро");
        }
    }
}
