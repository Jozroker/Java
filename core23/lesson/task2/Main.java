package mainPackage.core23.lesson.task2;

import mainPackage.core23.lesson.task1.DelegateCouncilSingleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zooclub club = new Zooclub();
        System.out.println("1 - Add new club member");
        System.out.println("2 - Add new pet to club member");
        System.out.println("3 - Remove pet from club member");
        System.out.println("4 - Remove club member");
        System.out.println("5 - Remove some pet from all members");
        System.out.println("6 - Show zooclub");
        System.out.println("0 - Exit");
        boolean value = true;
        while (value) {
            System.out.print("Enter action number: ");
            int count = sc.nextInt();
            switch (count) {
                case 1:
                    club.addMember();
                    break;
                case 2:
                    club.addMemberPet();
                    break;
                case 3:
                    club.removeMemberPet();
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println(club.toString());
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
