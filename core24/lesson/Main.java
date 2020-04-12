package mainPackage.core24.lesson;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        DecimalFormat twoNumbers = new DecimalFormat("00");
        Cinema cinema = new Cinema(new Time(9, 0), new Time(0,0));
        System.out.println("1 - Add new movie to library");
        System.out.println("2 - Add new seance");
        System.out.println("3 - Remove movie from cinema");
        System.out.println("4 - Remove seance");
        System.out.println("5 - Show all seances");
        System.out.println("6 - Show cinema library");
        System.out.println("0 - Exit");
        boolean value = true;
        while (value) {
            System.out.print("Enter operation number: ");
            int operation = sc.nextInt();
            sc.nextLine();
            switch (operation) {
                case 1:
                    System.out.print("Enter movie name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter movie duration(hh:mm): ");
                    String time = sc.next();
                    while (true) {
                        if ((time.length() == 5) && time.indexOf(":") == 2) {
                            break;
                        } else {
                            System.out.println("Incorrect input. Try again");
                            time = sc.next();
                        }
                    }
                    int hour = Integer.parseInt(time.substring(0, 2));
                    System.out.println(hour);
//                    cinema.addMovie(new Movie(name, new Time(hour, minute)));
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println(cinema.showCinemaLibrary());
                    break;
                case 0:
                    value = false;
                    break;
                default:
                    System.out.println("Undefined operation");
            }
            System.out.println("=============================");
        }
    }
}
