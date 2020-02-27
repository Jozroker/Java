package mainPackage.javaCore4.lesson;

import java.util.Arrays;

public class Car {
    private String brand;
    private String model;
    private String color;
    private Wheel[] wheels = new Wheel[4];
    private int wheelsQuantity = 4;
    private Helm helm;
    private CarBody body;
    private StringBuilder carWheels = new StringBuilder();
//    private String[] carWheels = new String[wheels.length];

    public Car(){};

    public Car(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Car(String brand, String model, String color, Wheel[] wheels, Helm helm, CarBody body){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.wheels = wheels;
        this.helm = helm;
        this.body = body;
    }

//    public String getWheels(){
//        for (int i = 0; i < carWheels.length; i++){
//            carWheels[i] = "Disk Diameter = " + wheels[i].getDiskDiameter() +
//                    " Tire Diameter = " + wheels[i].getTireDiameter() +
//                    " Position = " + wheels[i].getPosition();
//        }
//        return "Car wheels: "+ Arrays.toString(carWheels);
//    }

    public String getWheels(){
        for (int i = 0; i < wheels.length; i++) {
            carWheels.append("Disk Diameter = " + wheels[i].getDiskDiameter() +
                    " Tire Diameter = " + wheels[i].getTireDiameter() +
                    " Position = " + wheels[i].getPosition());
        }
        return "Car wheels: " + carWheels;
    }

    public void start(){
        System.out.println("Starting car...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' + ", \n" +
                "model='" + model + '\'' + ", \n" +
                "color='" + color + '\'' + ", \n" +
                "wheels=[" + carWheels + "], \n" +
                "wheelsQuantity=" + wheelsQuantity + ", \n" +
                "helm=" + helm.toString() + ", \n" +
                "body=" + body.toString() +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getWheelsQuantity() {
        return wheelsQuantity;
    }

    public Helm getHelm() {
        return helm;
    }

    public CarBody getBody() {
        return body;
    }
}
