package mainPackage.javaCore13.lesson.task1;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Singleton VRU = new Singleton();
        Scanner sc = new Scanner(System.in);
        boolean bool = true;

        System.out.println("1 - Add fraction");
        System.out.println("2 - Remove fraction");
        System.out.println("3 - View all fractions");
        System.out.println("4 - Clear fraction");
        System.out.println("5 - View fraction");
        System.out.println("6 - Add delegate to fraction");
        System.out.println("7 - Remove delegate from fraction");
        System.out.println("8 - View list of bribers");
        System.out.println("9 - View biggest briber");
        System.out.println("10 - Add bribe");
        System.out.println("0 - Exit");
        while(bool) {
            try {
                int value = sc.nextInt();
                switch (value) {
                    case 0:
                        bool = false;
                        break;
                    case 1:
                        VRU.addFraction(nameFraction());
                        break;
                    case 2:
                        VRU.removeFraction(nameFraction());
                        break;
                    case 3:
                        VRU.viewAllFractions();
                        break;
                    case 4:
                        VRU.clearFraction(nameFraction());
                        break;
                    case 5:
                        VRU.viewFraction(nameFraction());
                        break;
                    case 6:
                        VRU.addDelegate(nameFraction());
                        break;
                    case 7:
                        VRU.removeDelegate(nameFraction());
                        break;
                    case 8:
                        VRU.viewBribers();
                        break;
                    case 9:
                        VRU.viewBiggestBriber();
                        break;
                    case 10:
                        System.out.print("Input bribe count: ");
                        double count = sc.nextDouble();
                        VRU.addBribe(count);
                        break;
                    default:
                        System.out.println("Incorrect value. Try again");
                }
                System.out.println("==========================\n");
            } catch (InputMismatchException e) {
                System.out.println("Incorrect type of value");
            }
        }
    }

    public static String nameFraction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Fraction name: ");
        return sc.nextLine();
    }
}
