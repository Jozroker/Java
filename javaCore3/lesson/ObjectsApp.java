package mainPackage.javaCore3.lesson;


public class ObjectsApp {
    public static void main(String[] args) {
        Rectangle rectDefault = new Rectangle();
        System.out.println(rectDefault);

        Rectangle rect = new Rectangle(4, 5);
        System.out.println(rect);

        Circle circleDefault = new Circle();
        System.out.println(circleDefault);

        Circle circle = new Circle(3.18);
        System.out.println(circle);

        rect.setParameters(1, 3);
        System.out.println(rect);
    }
}
