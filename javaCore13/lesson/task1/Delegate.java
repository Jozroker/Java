package mainPackage.javaCore13.lesson.task1;

import java.util.Scanner;

public class Delegate extends People {
    Scanner sc = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int age;
    private boolean briber;
    private double bribeSize;

    public Delegate(String firstName, String lastName, int weight, int length, int age, boolean briber) {
        super(weight, length);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.briber = briber;
        if (briber) {
            System.out.print("Input bribe size: ");
            double bribeSize = sc.nextDouble();
            this.addBribe(bribeSize);
        }
    }

    public void addBribe(double bribeSize) {
        if (this.briber) {
            if (bribeSize > 5000) {
                System.out.println("Police imprison delegate");
            } else {
                this.bribeSize = bribeSize;
            }
        } else {
            System.out.println("This delegate don't take bribe...");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isBriber() {
        return briber;
    }

    public double getBribeSize() {
        return bribeSize;
    }

    @Override
    public String toString() {
        if (this.briber) {
            return "\n     Delegate{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", briber=Yes" +
                    ", bribeSize=" + bribeSize +
                    '}';
        } else {
            return "\n     Delegate{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", briber=No" +
                    '}';
        }
    }
}
