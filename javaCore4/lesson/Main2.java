package mainPackage.javaCore4.lesson;

public class Main2 {
    public static void main(String[] args) {
        Wheel whl1 = new Wheel(150, 175, "left-top");
        Wheel whl2 = new Wheel(150, 175, "left-bottom");
        Wheel whl3 = new Wheel(150, 175, "right-top");
        Wheel whl4 = new Wheel(150, 175, "right-bottom");
        Wheel[] wheels = {whl1, whl2, whl3, whl4};
        Wheel[] wheels2 = {whl2, whl4, whl1, whl3};

        Helm helm = new Helm("black", "leather", 30);
        CarBody body = new CarBody("steel", "black", "miniven", 5);
        Car car1 = new Car("Renault", "Scenic", "black", wheels, helm, body);

        car1.start();
        car1.getWheels();
        System.out.println();
        System.out.println(car1.toString());

        car1.setColor("red");
        car1.setWheels(wheels2);
        System.out.println();
        System.out.println(car1.getColor() + "\n" + car1.getWheels() + "\n" + car1.getBrand() + "\n" + car1.getModel()
                + "\n" + car1.getBody() + "\n" + car1.getHelm() + "\n" + car1.getWheelsQuantity());
    }
}
