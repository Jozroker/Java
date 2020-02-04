package mainPackage.javaCore8.lesson;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Month month = null;
        boolean value = true;

        System.out.println("Enter month - press 0");
        System.out.println("Check month value - press 1");
        System.out.println("Return months with same season - press 2");
        System.out.println("Return months with same quantity of days - press 3");
        System.out.println("Return months with less quantity of days - press 4");
        System.out.println("Return months with more quantity of days - press 5");
        System.out.println("Return next season - press 6");
        System.out.println("Return previous season - press 7");
        System.out.println("Return all months with pair quantity of days  - press 8");
        System.out.println("Return all months with unpair quantity of days - press 9");
        System.out.println("Check month to pair quantity of days current month - press 10");
        System.out.println("Quit - press 11");


        while(value){

            int press = sc.nextInt();
            if (press < 0 || press > 11){
                System.out.println("Error! Undefined value. Enter correct number");
            } else {
                switch (press){
                    case 0:
                        String selectedMonth = sc.next().toUpperCase();
                        for (int i = 0; i < Month.values().length; i++){
                            if (selectedMonth.equals(Month.values()[i].name())){
                                month = Month.valueOf(selectedMonth);
                                break;
                            }
                        }
                        if (month == null){
                            System.out.println("Error! Undefined month value. Enter correct month");
                        } else {
                            System.out.println("Selected month = " + month.name());
                        }
                        System.out.println("-----");
                        break;
                    case 1:
                        String enteredMonth = sc.next().toUpperCase();
                        boolean temp = false;
                        for (int i = 0; i < Month.values().length; i++){
                            if (enteredMonth.equals(Month.values()[i].name())){
                                temp = true;
                                break;
                            }
                        }
                        if (temp){
                            System.out.println("Month " + enteredMonth + " exist");
                        } else {
                            System.out.println("Month " + enteredMonth + " not exist");
                        }
                        System.out.println("-----");
                        break;
                    case 2:
                        if (month == null){
                            System.out.println("Error! Month not selectet");
                        } else {
                        Season selectedSeason = month.getSeason();
                        System.out.print("Months with same season: ");
                        for (int i = 0; i < Month.values().length; i++) {
                            if (Month.values()[i].getSeason() == selectedSeason) {
                                System.out.print(Month.values()[i] + " ");
                                }
                            }
                        }
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 3:
                        if (month == null){
                            System.out.println("Error! Month not selectet");
                        } else {
                            int dayQuantity = month.getDay();
                            System.out.print("Months with same quantity of days: ");
                            for (int i = 0; i < Month.values().length; i++) {
                                if (Month.values()[i].getDay() == dayQuantity) {
                                    System.out.print(Month.values()[i] + " ");
                                }
                            }
                        }
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 4:
                        if (month == null){
                            System.out.println("Error! Month not selectet");
                        } else {
                            int dayQuantity = month.getDay();
                            String lessQuantity = "Months with less quantity of days: ";
                            StringBuilder less = new StringBuilder(lessQuantity);
                            for (int i = 0; i < Month.values().length; i++) {
                                if (Month.values()[i].getDay() < dayQuantity) {
                                    less.append(Month.values()[i]).append(" ");
                                }
                            }
                            if (less.toString().equals(lessQuantity)){
                                System.out.println("No months with less quantity of days");
                            } else {
                                System.out.println(less);
                            }
                        }
                        System.out.println("-----");
                        break;
                    case 5:
                        if (month == null){
                            System.out.println("Error! Month not selectet");
                        } else {
                            int dayQuantity = month.getDay();
                            String moreQuantity = "Months with more quantity of days: ";
                            StringBuilder more = new StringBuilder(moreQuantity);
                            for (int i = 0; i < Month.values().length; i++) {
                                if (Month.values()[i].getDay() > dayQuantity) {
                                    more.append(Month.values()[i]).append(" ");
                                }
                            }
                            if (more.toString().equals(moreQuantity)){
                                System.out.println("No months with more quantity of days");
                            } else {
                                System.out.println(more);
                            }
                        }
                        System.out.println("-----");
                        break;
                    case 6:
                        if (month == null){
                            System.out.println("Error! Month not selectet");
                        } else {
                            Season season = month.getSeason();
                            for (int i = 0; i < Month.values().length; i++){
                                if (Month.values()[i].getSeason() == season){
                                    System.out.println("Next season is: "+Month.values()[i+3].getSeason());
                                    break;
                                }
                            }
                        }
                        System.out.println("-----");
                        break;
                    case 7:
                        if (month == null){
                            System.out.println("Error! Month not selectet");
                        } else {
                            Season season = month.getSeason();
                            int count = 0;
                            for (int i = 0; i < Month.values().length; i++){
                                if (Month.values()[i].getSeason() == season){
                                    count++;
                                }
                                if (count == 3){
                                    System.out.println("Previous season is: "+Month.values()[i-3].getSeason());
                                    break;
                                }
                            }
                        }
                        System.out.println("-----");
                        break;
                    case 8:
                        System.out.print("Months with pair quantity of days: ");
                        for (int i = 0; i < Month.values().length; i++){
                            if (Month.values()[i].getDay() % 2 == 0){
                                System.out.print(Month.values()[i]+" ");
                            }
                        }
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 9:
                        System.out.print("Months with not pair quantity of days: ");
                        for (int i = 0; i < Month.values().length; i++){
                            if (Month.values()[i].getDay() % 2 != 0){
                                System.out.print(Month.values()[i]+" ");
                            }
                        }
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 10:
                        if (month == null){
                            System.out.println("Error! Month not selectet");
                        } else {
                            if (month.getDay() % 2 == 0){
                                System.out.println("Month " + month.name() + " nave pair quantity of days: " + month.getDay());
                            } else {
                                System.out.println("Month " + month.name() + " nave not pair quantity of days: " + month.getDay());
                            }
                        }
                        System.out.println("-----");
                        break;
                    case 11:
                        System.out.println("End program");
                        value = false;
                        break;

                }
            }
        }

    }
}
