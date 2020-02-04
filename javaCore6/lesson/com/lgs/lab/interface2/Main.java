package mainPackage.javaCore6.lesson.com.lgs.lab.interface2;

import mainPackage.javaCore6.lesson.com.lgs.lab.interface1.Numerable;

public class Main {
    public static void main(String[] args) {
        MyCalculator calc1 = new MyCalculator();
        Numerable calc2 = new MyCalculator();

        calc1.add(5,5);
        calc1.minus(5,5);
        calc1.multiply(5,5);
        calc1.devide(5,5);
        System.out.println("\n");
        calc2.add(5,5);
        calc2.minus(5,5);
        calc2.multiply(5,5);
        calc2.devide(5,5);
    }
}
