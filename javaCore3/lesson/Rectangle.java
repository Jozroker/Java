package mainPackage.javaCore3.lesson;

public class Rectangle {
    private int length;
    private int width;
    private double area;
    private double perimeter;

    public Rectangle(){
        this.length = 1;
        this.width = 1;
        this.area = 1;
        this.perimeter = 4;
    }

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        this.area = length * width;
        this.perimeter = 2 * (length + width);
    }

    public void setParameters(int length, int width){
        this.length = length;
        this.width = width;
        this.area = length * width;
        this.perimeter = 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Площа прямокутника = " +
                 area +
                "\nПериметр прямокутника = " + perimeter;
    }
}

