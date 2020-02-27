package mainPackage.javaCore4.lesson;

public class CarBody {

    private String material;
    private String color;
    private String carType;
    private int doorQuantity;

    public CarBody(){};

    public CarBody(String material, String color, String carType, int doorQuantity){
        this.material = material;
        this.color = color;
        this.carType = carType;
        this.doorQuantity = doorQuantity;
    }

    @Override
    public String toString() {
        return "CarBody{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", carType='" + carType + '\'' +
                ", doorQuantity=" + doorQuantity +
                '}';
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarType() {
        return carType;
    }

    public int getDoorQuantity() {
        return doorQuantity;
    }

}
