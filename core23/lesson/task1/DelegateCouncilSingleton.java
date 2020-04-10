package mainPackage.core23.lesson.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class DelegateCouncilSingleton {

    private Scanner sc = new Scanner(System.in);
    private List<Fraction> council = new ArrayList<>();

    public void addFraction() {
        System.out.print("Enter fraction name: ");
        String name = sc.next();
        council.add(new Fraction(name));
    }

    public void removeFraction() {
        System.out.print("Enter fraction name: ");
        String name = sc.next();
        if (council.stream().noneMatch(fraction -> fraction.getName().equals(name))) {
            System.out.println("Council hasn't such fraction");
        } else {
            council.removeIf(fraction -> fraction.getName().equals(name));
        }
    }

    public void showAllFractions() {
        council.forEach(fraction -> {
            System.out.println("Fraction name: " + fraction.getName());
            fraction.showAllDelegates();
        });
    }

    public void showFraction() {
        System.out.println("Enter fraction name: ");
        String name = sc.next();
        if (council.stream().noneMatch(fraction -> fraction.getName().equals(name))) {
            System.out.println("Council hasn't such fraction");
        } else {
            council.forEach(fraction -> {
                if (fraction.getName().equals(name)) {
                    System.out.println("Fraction name: " + fraction.getName());
                    fraction.showAllDelegates();
                }
            });
        }
    }

    public void addDelegateToFraction() {
        System.out.print("Enter fraction name: ");
        String name = sc.next();
        if (council.stream().noneMatch(fraction -> fraction.getName().equals(name))) {
            System.out.println("Council hasn't such fraction");
        } else {
            council.forEach(fraction -> {
                if (fraction.getName().equals(name)) {
                    fraction.addDelegate();
                }
            });
        }
    }

    public void removeDelegateFromFraction() {
        System.out.print("Enter fraction name: ");
        String name = sc.next();
        if (council.stream().noneMatch(fraction -> fraction.getName().equals(name))) {
            System.out.println("Council hasn't such fraction");
        } else {
            council.forEach(fraction -> {
                if (fraction.getName().equals(name)) {
                    fraction.removeDelegate();
                }
            });
        }
    }

    public void showAllBribers() {
        council.forEach(fraction ->  {
            System.out.println("Fraction: " + fraction.getName());
            fraction.showAllBribers();
        });
    }

    public void showBiggestBriber() {
        System.out.println("The biggest briber is: ");
        List<Delegate> bribers = new ArrayList<>();
        council.forEach(fraction -> {
            bribers.add(fraction.showBiggestBriber());
        });
        Delegate biggestBriber = bribers.stream().max((d1, d2) -> (int) (d1.getBribeValue() - d2.getBribeValue())).orElse(null);
        System.out.println(biggestBriber.toString());
        council.forEach(fraction -> {
            fraction.getFraction().forEach(delegate -> {
                if (delegate.getFirstname().equals(biggestBriber.getFirstname()) && delegate.getLastname().equals(biggestBriber.getLastname())) {
                    System.out.println("Fraction: " + fraction.getName());
                }
            });
        });
    }

    //not used in Main
    public void showAllDelegates() {
        System.out.print("Enter fraction name: ");
        String name = sc.next();
        council.forEach(fraction -> {
            if (fraction.getName().equals(name)) {
                fraction.showAllDelegates();
            }
        });
    }

    public void clearFraction() {
        System.out.print("Enter fraction name: ");
        String name = sc.next();
        council.forEach(fraction -> {
            if (fraction.getName().equals(name)) {
                fraction.clear();
            }
        });
    }
}
