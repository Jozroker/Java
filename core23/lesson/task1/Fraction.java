package mainPackage.core23.lesson.task1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fraction {

    private Scanner sc = new Scanner(System.in);
    private List<Delegate> fraction = new ArrayList<>();
    private String name;

    public Fraction(String name) {
        this.name = name;
    }

    public void addDelegate() {
        System.out.print("Enter firstname: ");
        String fname = sc.nextLine();
        System.out.print("Enter lastname: ");
        String lname = sc.nextLine();
        System.out.print("Enter weight: ");
        int weight = sc.nextInt();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Is briber?(true/false): ");
        boolean briber = sc.nextBoolean();
        this.fraction.add(new Delegate(weight, height, fname, lname, age, briber));
        if (briber) {
            this.fraction.forEach(delegate -> {
                if (delegate.getFirstname().equals(fname) && delegate.getLastname().equals(lname)) {
                    delegate.setBribeValue();
                }
            });
        }
    }

    public void removeDelegate() {
        System.out.print("Enter firstname: ");
        String fname = sc.nextLine();
        System.out.print("Enter lastname: ");
        String lname = sc.nextLine();
        if (fraction.stream()
                .noneMatch(delegate -> delegate.getFirstname().equals(fname) && delegate.getLastname().equals(lname))) {
            System.out.println("Fraction " + this.name + " hasn't such delegate");
        } else {
            fraction.removeIf(delegate -> delegate.getFirstname().equals(fname) && delegate.getLastname().equals(lname));
        }
    }

    public void showAllBribers() {
        System.out.println("Bribers: ");
//        fraction.forEach(delegate -> {
//            if (delegate.isBriber()) {
//                System.out.println(delegate.toString());
//            }
//        });
        if (fraction.stream().noneMatch(Delegate::isBriber)) {
            System.out.println("Fraction hasn't bribers");
        } else {
            fraction.stream()
                    .filter(Delegate::isBriber)
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        }
    }

    public Delegate showBiggestBriber() {
        return fraction.stream()
                .filter(Delegate::isBriber)
                .max((e1, e2) -> (int) (e1.getBribeValue() - e2.getBribeValue()))
                .orElse(null);
    }

    public void showAllDelegates() {
        if (fraction.isEmpty()) {
            System.out.println("Fraction hasn't delegates");
        } else {
            System.out.println("All delegates of fraction \"" + this.name + "\":");
            fraction.forEach(System.out::println);
        }
    }

    public void clear() {
        fraction.clear();
    }

    public String getName() {
        return name;
    }

    public List<Delegate> getFraction() {
        return fraction;
    }
}
