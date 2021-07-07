package mainPackage.javaCore12.lesson.task1;

public class Helm {
    private double helmDiameter;
    private String material;

    public Helm(double helmDiameter, String material) {
        this.helmDiameter = helmDiameter;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "helmDiameter=" + helmDiameter +
                ", material='" + material + '\'' +
                '}';
    }

    public void setHelmDiameter(double helmDiameter) {
        this.helmDiameter = helmDiameter;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
