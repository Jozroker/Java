package mainPackage.javaCore12.lesson.task1;

public class Auto {
    private int horsesPower;
    private int year;
    private Helm helm;
    private Engine engine;

    public Auto(int horsesPower, int year, double helmDiameter, String material, int cylinderQuantity) {
        this.horsesPower = horsesPower;
        this.year = year;
        this.helm = new Helm(helmDiameter, material);
        this.engine = new Engine(cylinderQuantity);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "horsesPower=" + horsesPower +
                ", year=" + year +
                ", helm=" + helm +
                ", engine=" + engine +
                '}';
    }

    public void setHorsesPower(int horsesPower) {
        this.horsesPower = horsesPower;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHelmDiameter(double helmDiameter) {
        this.helm.setHelmDiameter(helmDiameter);
    }

    public void setHelmMaterial(String helmMaterial) {
        this.helm.setMaterial(helmMaterial);
    }

    public void setEngineCylinderQuantity(int cylinderQuantity) {
        this.engine.setCylindersQuantity(cylinderQuantity);
    }
}
