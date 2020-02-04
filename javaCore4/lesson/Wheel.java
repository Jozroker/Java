package mainPackage.javaCore4.lesson;

public class Wheel {
    private int diskDiameter;
    private int tireDiameter;
    private String position;

    public Wheel(){};

    public Wheel(int diskDiameter, int tireDiameter, String position){
        this.diskDiameter = diskDiameter;
        this.tireDiameter = tireDiameter;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diskDiameter=" + diskDiameter +
                ", tireDiameter=" + tireDiameter +
                ", position='" + position + '\'' +
                '}';
    }

    public int getDiskDiameter() {
        return diskDiameter;
    }

    public int getTireDiameter() {
        return tireDiameter;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
