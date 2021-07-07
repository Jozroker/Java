package mainPackage.javaCore7.lesson;

public class Su27 extends Plane implements StelceTechnology, TurboBoost, NuclearStrike{
    private int maxSpeed;
    private String color;



    public Su27(int length, int width, int weight, PlaneControl control, int maxSpeed, String color){
        super(length, width, weight, control);
        this.maxSpeed = maxSpeed;
        this.color = color;

    }

    @Override
    public String toString(){
        return "Su27{width: " + super.getWidth() +
                ", length: " + super.getLength() +
                ", weight: " + super.getWeight() +
                ", maxspeed: " + maxSpeed +
                ", color: " + color +
                "}";
    }

    @Override
    public void stelce(){
        System.out.println("Stelce mode time: "+(random.nextInt(10)+1)+" minute");
    }

    @Override
    public void turbo(){
        System.out.println("Boost speed is " + (maxSpeed+random.nextInt(81) + 20));
    }

    @Override
    public void strike(){
        System.out.println("Throwing nuclear bombs: "+(random.nextInt(10)+1));
    }

}
