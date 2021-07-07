package mainPackage.javaCore7.lesson;

public class Main {
    public static void main(String[] args) {
        PlaneControl control = new PlaneControl();
        Su27 plane = new Su27(57,11,212, control,412, "gray");
        System.out.println(plane.toString());
        plane.startEngine();
        plane.takeOff();
        plane.moveUp();
        plane.moveRight();
        plane.moveDown();
        plane.moveLeft();
        plane.stelce();
        plane.strike();
        plane.turbo();
        plane.landing();
    }


}
