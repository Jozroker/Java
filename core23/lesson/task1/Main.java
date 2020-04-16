package mainPackage.core23.lesson.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DelegateCouncilSingleton delegateCouncil = new DelegateCouncilSingleton();
        System.out.println("1 - Add new fraction");
        System.out.println("2 - Remove fraction");
        System.out.println("3 - Show all fractions");
        System.out.println("4 - Clear fraction");
        System.out.println("5 - Show fraction");
        System.out.println("6 - Add delegate to fraction");
        System.out.println("7 - Remove delegate from fraction");
        System.out.println("8 - Show all bribers");
        System.out.println("9 - Show the biggest briber");
        System.out.println("0 - Exit");
        boolean value = true;
        while (value) {
            System.out.print("Enter action number: ");
            int count = sc.nextInt();
            switch (count) {
                case 1:
                    delegateCouncil.addFraction();
                    break;
                case 2:
                    delegateCouncil.removeFraction();
                    break;
                case 3:
                    delegateCouncil.showAllFractions();
                    break;
                case 4:
                    delegateCouncil.clearFraction();
                    break;
                case 5:
                    delegateCouncil.showFraction();
                    break;
                case 6:
                    delegateCouncil.addDelegateToFraction();
                    break;
                case 7:
                    delegateCouncil.removeDelegateFromFraction();
                    break;
                case 8:
                    delegateCouncil.showAllBribers();
                    break;
                case 9:
                    delegateCouncil.showBiggestBriber();
                    break;
                case 0:
                    value = false;
                    break;
                default:
                    System.out.println("Error. incorrect value");


            }
            System.out.println("================================");
            sc.nextLine();
        }
    }
}
