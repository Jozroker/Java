package mainPackage.javaCore14.lesson.task2;

import java.util.Objects;

public class Commodity {

    private String name;
    private double length;
    private double width;
    private double weight;

    public Commodity(String name, double length, double width, double weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return Double.compare(commodity.length, length) == 0 &&
                Double.compare(commodity.width, width) == 0 &&
                Double.compare(commodity.weight, weight) == 0 &&
                Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, width, weight);
    }

    @Override
    public String toString() {
        return "\nCommodity{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
