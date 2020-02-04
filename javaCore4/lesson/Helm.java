package mainPackage.javaCore4.lesson;

public class Helm {

    private String color;
    private String material;
    private int diameter;

    public Helm(){};

    public Helm(String color, String material, int diameter){
        this.color = color;
        this.material = material;
        this.diameter = diameter;
    }

    public void turnHelmLeft(){
        System.out.println("Wheels turn left...");
    }

    public void turnHelmRight(){
        System.out.println("Wheels turn right...");
    }

    @Override
    public String toString() {
        return "Helm{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", diameter=" + diameter +
                '}';
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getDiameter() {
        return diameter;
    }
}
