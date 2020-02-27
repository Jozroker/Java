package mainPackage.javaCore15.lesson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        boolean value = true;
        Scanner sc = new Scanner(System.in);
        Map<String, ZooClub> clubs = new HashMap<>();

        System.out.println("1 - Create new zooclub");
        System.out.println("2 - Add new club member");
        System.out.println("3 - Add new pet to club member");
        System.out.println("4 - Remove pet from club member");
        System.out.println("5 - Remove club member");
        System.out.println("6 - Remove some pet from all members");
        System.out.println("7 - View zooclub");
        System.out.println("0 - Exit");
        System.out.println();

        while (value) {
            System.out.print("Action: ");
            String club;
            int action = sc.nextInt();
            switch (action) {
                case 0:
                    value = false;
                    break;
                case 1:
                    System.out.print("Enter club name: ");
                    String clubName = sc.next();
                    clubs.put(clubName, new ZooClub(new HashMap<>()));
                    break;
                case 2:
                    System.out.print("Choose club: ");
                    club = sc.next();
                    if (!clubs.containsKey(club)) {
                        System.out.println("Club not exist...");
                        break;
                    }
                    System.out.print("Enter member name: ");
                    String name = sc.next();
                    System.out.print("Enter member age: ");
                    int age = sc.nextInt();
                    for (Map.Entry<String, ZooClub> stringZooClubEntry : clubs.entrySet()) {
                        if (stringZooClubEntry.getKey().equals(club)) {
                            stringZooClubEntry.getValue().newClubMember(name, age);
                        }
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.print("Choose club: ");
                    club = sc.next();
                    if (!clubs.containsKey(club)) {
                        System.out.println("Club not exist...");
                        break;
                    }
                    for (Map.Entry<String, ZooClub> stringZooClubEntry : clubs.entrySet()) {
                        if (stringZooClubEntry.getKey().equals(club)) {
                            System.out.println();
                            System.out.println(stringZooClubEntry.getKey());
                            System.out.println(stringZooClubEntry.getValue().toString());
                            System.out.println();
                        }
                    }
                    break;
                default:
                    System.out.println("Incorrect action! Try again.");
            }

        }

    }
}
