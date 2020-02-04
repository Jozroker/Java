package mainPackage.javaCore3.lesson;
import static java.lang.Math.*;
public class Circle {

    private double radius;
    private double diameter;
    private double area;
    private double length;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
        this.diameter = 2 * radius;
        this.area = PI * pow(radius, 2);
        this.length = 2 * PI * radius;
    }

    public void setParameters(double radius, double diameter){
        this.radius = radius;
        this.diameter = 2 * radius;
        this.area = PI * pow(radius, 2);
        this.length = 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Площа кола = " + area +
                "\nДовжина кола = " + length;
    }
}
