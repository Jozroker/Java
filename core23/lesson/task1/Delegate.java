package mainPackage.core23.lesson.task1;

import java.util.Scanner;

public class Delegate extends People {

    private String firstname;
    private String lastname;
    private int age;
    private boolean briber;
    private double bribeValue;

    public Delegate(int weight, double height, String firstname, String lastname, int age, boolean briber) {
        super(weight, height);
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.briber = briber;
    }

    public void setBribeValue() {
        if (!this.briber) {
            System.out.println("This delegate don't take bribes");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input bribe value: ");
            double bribeValue = sc.nextInt();
            if (bribeValue > 5000) {
                System.out.println("Police will prison this delegate");
            } else {
                this.bribeValue = bribeValue;
            }
        }
    }

    @Override
    public String toString() {
        return "Delegate{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", briber=" + briber +
                ", bribeValue=" + bribeValue +
                ", weight=" + super.getWeight() +
                ", height=" + super.getHeight() +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isBriber() {
        return briber;
    }

    public double getBribeValue() {
        return bribeValue;
    }
}
