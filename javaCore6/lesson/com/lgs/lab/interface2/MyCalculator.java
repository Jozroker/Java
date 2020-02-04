package mainPackage.javaCore6.lesson.com.lgs.lab.interface2;

import mainPackage.javaCore6.lesson.com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {



    @Override
    public void add(int i, int j){
        int add = i + j;
        System.out.println("Add: " + add);
    }

    @Override
    public void minus(int i, int j){
        int minus = i - j;
        System.out.println("Minus: " + minus);
    }

    @Override
    public void multiply(int i, int j){
        int multiply = i * j;
        System.out.println("Multiply: " + multiply);
    }

    @Override
    public void devide(int i, int j){
        double devide = (double) i / j;
        System.out.printf("Devide: %.2f", devide);
    }

}
