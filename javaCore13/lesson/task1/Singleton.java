package mainPackage.javaCore13.lesson.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Singleton {
    private Scanner sc = new Scanner(System.in);
    private List<Fraction> fractions = new ArrayList<>();

    public void addFraction(String name) {
        fractions.add(new Fraction(name));
    }

    public void removeFraction(String name) {
        fractions.removeIf(elem -> elem.getName().equals(name));
    }

    public void viewAllFractions() {
        System.out.println("Fractions: ");
        Iterator<Fraction> iter = fractions.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
    }

    public void viewFraction(String name) {
        Iterator<Fraction> iter = fractions.iterator();
        while (iter.hasNext()) {
            Fraction currentFraction = iter.next();
            if (currentFraction.getName().equals(name)) {
                System.out.println(currentFraction.toString());
            }
        }
    }

    public void addBribe(double count) {
        System.out.print("Enter delegate first name: ");
        String fname = sc.next();
        System.out.print("Enter delegate last name: ");
        String lname = sc.next();
        for(Fraction elem : fractions) {
            for(Delegate elem2 : elem.getDelegates()) {
                if(elem2.getFirstName().equals(fname) && elem2.getLastName().equals(lname)) {
                    elem2.addBribe(count);
                }
            }
        }
    }

    public void addDelegate(String nameFraction) {
        Iterator<Fraction> iter = fractions.iterator();
        while (iter.hasNext()) {
            Fraction currentFraction = iter.next();
            if (currentFraction.getName().equals(nameFraction)) {
                currentFraction.addDelegate();
            }
        }
    }

    public void removeDelegate(String nameFraction) {
        Iterator<Fraction> iter = fractions.iterator();
        while (iter.hasNext()) {
            Fraction currentFraction = iter.next();
            if (currentFraction.getName().equals(nameFraction)) {
                currentFraction.removeDelegate();
            }
        }
    }

    public void viewBribers() {
        System.out.println("List of bribers: ");
        Iterator<Fraction> iter = fractions.iterator();
        while(iter.hasNext()) {
            Fraction currentFraction = iter.next();
            System.out.println("Fraction: " + currentFraction.getName());
            currentFraction.viewBribers();
        }
    }

    public void viewBiggestBriber() {
        Delegate biggestBriber = null;
        double count = 0;
        for(Fraction elem : fractions) {
            for(Delegate elem2 : elem.getDelegates()) {
                if(elem2.isBriber()) {
                    if(elem2.getBribeSize() > count) {
                        biggestBriber = elem2;
                        count = biggestBriber.getBribeSize();
                    }
                }
            }
        }
        System.out.println("Biggest briber is: " + biggestBriber);
    }

    public void viewAllDelegates(String nameFraction) {
        Iterator<Fraction> iter = fractions.iterator();
        while(iter.hasNext()) {
            Fraction currentFraction = iter.next();
            if(currentFraction.getName().equals(nameFraction)) {
                currentFraction.viewFractionDelegates();
            }
        }
    }

    public void clearFraction(String nameFraction) {
        Iterator<Fraction> iter = fractions.iterator();
        while(iter.hasNext()) {
            Fraction currentFraction = iter.next();
            if(currentFraction.getName().equals(nameFraction)) {
                currentFraction.clearFraction();
            }
        }
    }

}
