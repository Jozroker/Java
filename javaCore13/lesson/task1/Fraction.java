package mainPackage.javaCore13.lesson.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {

    private Scanner sc = new Scanner(System.in);
    private String name;
    private List<Delegate> delegates = new ArrayList<>();
    Iterator iter = delegates.iterator();

    public Fraction(String name) {
        this.name = name;
    }

    public void addDelegate() {
        System.out.print("Input first name: ");
        String fname = sc.next();
        System.out.print("Input last name: ");
        String lname = sc.next();
        System.out.print("Input age: ");
        int age = sc.nextInt();
        System.out.print("Input weight: ");
        int weight = sc.nextInt();
        System.out.print("Input lenght: ");
        int lenght = sc.nextInt();
        System.out.print("Briber (true/false): ");
        boolean bribe = sc.nextBoolean();
        delegates.add(new Delegate(fname, lname, weight, lenght, age, bribe));
    }

    public void removeDelegate() {
        System.out.print("Enter delegate first name: ");
        String fname = sc.next();
        System.out.print("Enter delegate last name: ");
        String lname = sc.next();
        delegates.removeIf(elem -> (elem.getFirstName().equals(fname) && elem.getLastName().equals(lname)));
    }

    public void viewBribers() {
        System.out.println("Bribers: ");
        Iterator<Delegate> iter = delegates.iterator();
        int countBribers = 0;
        while (iter.hasNext()) {
            Delegate currentDelegate = iter.next();
            if (currentDelegate.isBriber()) {
                System.out.println(currentDelegate.getFirstName() + " " + currentDelegate.getLastName() + " " + currentDelegate.getBribeSize());
                countBribers++;
            }
        }
        if (countBribers == 0) {
            System.out.println("This Fraction have any bribers");
        }
        System.out.println();
    }

    public Delegate viewBiggestBriber() {
        System.out.print("Biggest briber is: ");
        Iterator<Delegate> iter = delegates.iterator();
        int bribe = 0;
        Delegate biggestBriber = null;
        while (iter.hasNext()) {
            Delegate currentDelegate = iter.next();
            if (currentDelegate.isBriber() &&
                    currentDelegate.getBribeSize() > bribe) {
                biggestBriber = currentDelegate;
            }
        }
        return biggestBriber;
    }

    public void viewFractionDelegates() {
        System.out.println("Fraction name: " + name);
        System.out.println("Delegations: ");
        Iterator<Delegate> iter = delegates.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
    }

    public void viewFraction() {
        System.out.println(this.getName());
        System.out.println(this.delegates.toString());
    }

    public void clearFraction() {
        delegates.clear();
    }

    public String getName() {
        return name;
    }

    public List<Delegate> getDelegates() {
        return delegates;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "name='" + name + '\'' +
                ", delegates=" + delegates +
                "}\n";
    }
}
