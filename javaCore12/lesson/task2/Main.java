package mainPackage.javaCore12.lesson.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Month month = null;
        boolean value = true;
        List<Season> seasons = new ArrayList<>();
        seasons.add(new Season("WINTER"));
        seasons.add(new Season("SPRING"));
        seasons.add(new Season("SUMMER"));
        seasons.add(new Season("OUTUMN"));

        List<Month> months = new ArrayList<>();
        months.add(new Month(31, "JANUARY", seasons.get(0)));
        months.add(new Month(29, "FEBRUARY", seasons.get(0)));
        months.add(new Month(31, "MARCH", seasons.get(1)));
        months.add(new Month(30, "APRIL", seasons.get(1)));
        months.add(new Month(31, "MAY", seasons.get(1)));
        months.add(new Month(30, "JUNE", seasons.get(2)));
        months.add(new Month(31, "JULY", seasons.get(2)));
        months.add(new Month(31, "AUGUST", seasons.get(2)));
        months.add(new Month(30, "SEPTEMBER", seasons.get(3)));
        months.add(new Month(31, "OCTOBER", seasons.get(3)));
        months.add(new Month(30, "NOVEMBER", seasons.get(3)));
        months.add(new Month(31, "DECEMBER", seasons.get(0)));

        System.out.println("Enter month - press 0");
        System.out.println("Check month value - press 1");
        System.out.println("Return months of similar season - press 2");
        System.out.println("Check month with same quantity of days - press 3");
        System.out.println("Check month with less quantity of days - press 4");
        System.out.println("Check month with more quantity of days - press 5");
        System.out.println("Check next season - press 6");
        System.out.println("Check previous season - press 7");
        System.out.println("Check all months with pair quantity of days - press 8");
        System.out.println("Check all months with not pair quantity of days - press 9");
        System.out.println("Check this month to pair quantity of days - press 10");
        System.out.println("Quit - press 11");

        while (value) {

            int press = sc.nextInt();
            try {
                switch (press) {
                    case 0:

                        String selectedMonth = sc.next().toUpperCase();
                        for (Month item : months) {
                            if (selectedMonth.equals(item.getMonth())) {
                                month = item;
                                break;
                            }
                        }
                        if (month == null) {
                            throw new UndefinedMonth();
                        } else {
                            System.out.println("Selected month = " + month.getMonth());
                        }
                        System.out.println("-----");
                        break;
                    case 1:
                        String enteredMonth = sc.next().toUpperCase();
                        boolean temp = false;
                        for (Month item : months) {
                            if (enteredMonth.equals(item.getMonth())) {
                                temp = true;
                                break;
                            }
                        }
                        if (temp) {
                            System.out.println("Month " + enteredMonth + " exist");
                        } else {
                            System.out.println("Month " + enteredMonth + " not exist");
                        }
                        System.out.println("-----");
                        break;
                    case 2:
                        if (month == null) {
                            throw new UndefinedMonth();
                        } else {
                            Season selectedSeason = month.getSeason();
                            System.out.print("Months with same season: ");
                            for (Month item : months) {
                                if (item.getSeason() == selectedSeason) {
                                    System.out.print(item.getMonth() + " ");
                                }
                            }
                        }
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 3:
                        if (month == null) {
                            throw new UndefinedMonth();
                        } else {
                            int dayQuantity = month.getDay();
                            System.out.print("Months with same quantity of days: ");
                            for (Month item : months) {
                                if (item.getDay() == dayQuantity) {
                                    System.out.print(item.getMonth() + " ");
                                }
                            }
                        }
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 4:
                        if (month == null) {
                            throw new UndefinedMonth();
                        } else {
                            int dayQuantity = month.getDay();
                            String lessQuantity = "Months with less quantity of days: ";
                            StringBuilder less = new StringBuilder(lessQuantity);
                            for (Month item : months) {
                                if (item.getDay() < dayQuantity) {
                                    less.append(item.getMonth()).append(" ");
                                }
                            }
                            if (less.toString().equals(lessQuantity)) {
                                System.out.println("No months with less quantity of days");
                            } else {
                                System.out.println(less);
                            }
                        }
                        System.out.println("-----");
                        break;
                    case 5:
                        if (month == null) {
                            throw new UndefinedMonth();
                        } else {
                            int dayQuantity = month.getDay();
                            String moreQuantity = "Months with more quantity of days: ";
                            StringBuilder more = new StringBuilder(moreQuantity);
                            for (Month item : months) {
                                if (item.getDay() > dayQuantity) {
                                    more.append(item.getMonth()).append(" ");
                                }
                            }
                            if (more.toString().equals(moreQuantity)) {
                                System.out.println("No months with more quantity of days");
                            } else {
                                System.out.println(more);
                            }
                        }
                        System.out.println("-----");
                        break;
                    case 6:
                        if (month == null) {
                            throw new UndefinedMonth();
                        } else {
                            Season season = month.getSeason();
                            for (Month item : months) {
                                if (item.getSeason() == season) {
                                    int tmp = seasons.indexOf(season);
                                    try {
                                        System.out.println("Next season is: " + seasons.get(tmp + 1).getSeasonName());
                                    } catch (IndexOutOfBoundsException e) {
                                        System.out.println("Next season is: " + seasons.get(0).getSeasonName());
                                    }
                                    break;
                                }
                            }
                        }
                        System.out.println("-----");
                        break;
                    case 7:
                        if (month == null) {
                            throw new UndefinedMonth();
                        } else {
                            Season season = month.getSeason();
                            int count = 0;
                            for (Month item : months) {
                                if (item.getSeason() == season) {
                                    count++;
                                }
                                if (count == 3) {
                                    int tmp = seasons.indexOf(season);
                                    try {
                                        System.out.println("Previous season is: " + seasons.get(tmp - 1).getSeasonName());
                                    } catch (IndexOutOfBoundsException e) {
                                        System.out.println("Previous season is: " + seasons.get(seasons.size() - 1).getSeasonName());
                                    }
                                    break;
                                }
                            }
                        }
                        System.out.println("-----");
                        break;
                    case 8:
                        System.out.print("Months with pair quantity of days: ");
                        for (Month item : months) {
                            if (item.getDay() % 2 == 0) {
                                System.out.print(item.getMonth() + " ");
                            }
                        }
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 9:
                        System.out.print("Months with not pair quantity of days: ");
                        for (Month item : months) {
                            if (item.getDay() % 2 != 0) {
                                System.out.print(item.getMonth() + " ");
                            }
                        }
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 10:
                        if (month == null) {
                            throw new UndefinedMonth();
                        } else {
                            if (month.getDay() % 2 == 0) {
                                System.out.println("Month " + month.getMonth() + " have pair quantity of days: " + month.getDay());
                            } else {
                                System.out.println("Month " + month.getMonth() + " have not pair quantity of days: " + month.getDay());
                            }
                        }
                        System.out.println("-----");
                        break;
                    case 11:
                        System.out.println("End program");
                        value = false;
                        break;
                    default:
                        throw new WrongInputConsoleParametersException();
                }
            } catch (WrongInputConsoleParametersException e) {
                e.getMessage();
            } catch (UndefinedMonth e) {
                e.getMessage();
            }
        }

    }
}
