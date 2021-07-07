package mainPackage.javaCore12.lesson.task2;

import java.util.Scanner;

public class Main {

    private static Month month = null;

    public static void main(String[] args) {


        boolean isPerformed = true;

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

        while (isPerformed) {
            Scanner sc = new Scanner(System.in);
            int press = sc.nextInt();
            try {
                switch (press) {
                    case 0:
                        String selectedMonth = sc.next().toUpperCase();
                        selectMonth(selectedMonth);
                        System.out.println("Selected month = " + month.name());
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 1:
                        String enteredMonth = sc.next().toUpperCase();
                        if (checkMonthValue(enteredMonth)) {
                            System.out.println("Month " + enteredMonth + " exists");
                        } else {
                            System.out.println("Month " + enteredMonth + " not exists");
                        }
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 2:
                        System.out.print("Months with same season: ");
                        System.out.println(monthWithSimilarSeason());
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 3:
                        System.out.print("Months with same quantity of days: ");
                        System.out.print(monthWithSameDaysQty());
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 4:
                        System.out.println(monthWithLessDaysQty());
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 5:
                        System.out.println(monthWithMoreDaysQty());
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 6:
                        System.out.println(nextSeason());
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 7:
                        System.out.println(previousSeason());
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 8:
                        System.out.println(monthWithPairDaysQty());
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 9:
                        System.out.println(monthWithNotPairDaysQty());
                        System.out.println();
                        System.out.println("-----");
                        break;
                    case 10:
                        System.out.println(checkMonthDaysQty());
                        System.out.println("-----");
                        break;
                    case 11:
                        System.out.println("End program");
                        isPerformed = false;
                        break;
                    default:
                        throw new WrongInputConsoleParametersException();
                }
            } catch (WrongInputConsoleParametersException | UndefinedMonth e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String checkMonthDaysQty() throws UndefinedMonth {
        String result = "";
        if (month == null) {
            throw new UndefinedMonth();
        } else {
            if (month.getDay() % 2 == 0) {
                result = "Month " + month.name() + " have pair quantity of days: " + month.getDay();
            } else {
                result = "Month " + month.name() + " have not pair quantity of days: " + month.getDay();
            }
        }
        return result;
    }

    private static String monthWithNotPairDaysQty() {
        StringBuilder sb = new StringBuilder("Months with not pair quantity of days: ");
        for (Month item : Month.values()) {
            if (item.getDay() % 2 != 0) {
                sb.append(item.name() + " ");
            }
        }
        return String.valueOf(sb);
    }

    private static String monthWithPairDaysQty() {
        StringBuilder sb = new StringBuilder("Months with pair quantity of days: ");
        for (Month item : Month.values()) {
            if (item.getDay() % 2 == 0) {
                sb.append(item.name() + " ");
            }
        }
        return String.valueOf(sb);
    }

    private static String previousSeason() throws UndefinedMonth {
        String result = "";
        if (month == null) {
            throw new UndefinedMonth();
        } else {
            Season season = month.getSeason();
            int count = 0;
            for (Month item : Month.values()) {
                if (item.getSeason() == season) {
                    count++;
                }
                if (count == 3) {
                    Season previousSeason = previous(season);
                    result = "Next season is: " + previousSeason.name();
                    break;
                }
            }
        }
        return result;
    }

    private static String nextSeason() throws UndefinedMonth {
        String result = "";
        if (month == null) {
            throw new UndefinedMonth();
        } else {
            Season season = month.getSeason();
            for (Month item : Month.values()) {
                if (item.getSeason() == season) {
                    Season nextSeason = next(season);
                    result = "Next season is: " + nextSeason.name();
                    break;
                }
            }
        }
        return result;
    }

    private static String monthWithMoreDaysQty() throws UndefinedMonth {
        StringBuilder more = new StringBuilder();
        if (month == null) {
            throw new UndefinedMonth();
        } else {
            int dayQuantity = month.getDay();
            String moreQuantity = "Months with more quantity of days: ";
            more = new StringBuilder(moreQuantity);
            for (Month item : Month.values()) {
                if (item.getDay() > dayQuantity) {
                    more.append(item.name()).append(" ");
                }
            }
            if (more.toString().equals(moreQuantity)) {
                more = new StringBuilder("No months with more quantity of days");
            }
            return String.valueOf(more);
        }
    }

    private static String monthWithLessDaysQty() throws UndefinedMonth {
        StringBuilder less = new StringBuilder();
        if (month == null) {
            throw new UndefinedMonth();
        } else {
            int dayQuantity = month.getDay();
            String lessQuantity = "Months with less quantity of days: ";
            less = new StringBuilder(lessQuantity);
            for (Month item : Month.values()) {
                if (item.getDay() < dayQuantity) {
                    less.append(item.name()).append(" ");
                }
            }
            if (less.toString().equals(lessQuantity)) {
                less = new StringBuilder("No months with less quantity of days");
            }
        }
        return String.valueOf(less);
    }

    private static String monthWithSameDaysQty() throws UndefinedMonth {
        StringBuilder sb = new StringBuilder();
        if (month == null) {
            throw new UndefinedMonth();
        } else {
            int dayQuantity = month.getDay();
            for (Month item : Month.values()) {
                if (item.getDay() == dayQuantity) {
                    sb.append(item.name() + " ");
                }
            }
        }
        return String.valueOf(sb);
    }

    private static String monthWithSimilarSeason() throws UndefinedMonth {
        StringBuilder sb = new StringBuilder();
        if (month == null) {
            throw new UndefinedMonth();
        } else {
            Season selectedSeason = month.getSeason();
            for (Month item : Month.values()) {
                if (item.getSeason() == selectedSeason) {
                    sb.append(item.name() + " ");
                }
            }
        }
        return String.valueOf(sb);
    }

    private static void selectMonth(String stringMonth) throws UndefinedMonth {
        for (Month item : Month.values()) {
            if (stringMonth.equals(item.name())) {
                month = item;
                break;
            }
        }
        if (month == null) {
            throw new UndefinedMonth();
        }
    }

    private static boolean checkMonthValue(String stringMonth) {
        boolean monthExists = false;
        for (Month item : Month.values()) {
            if (stringMonth.equals(item.name())) {
                monthExists = true;
                break;
            }
        }
        return monthExists;
    }

    private static Season next(Season season) {
        Season nextSeason = null;
        int position = season.ordinal() + 1;
        if (position >= Season.values().length) {
            position = 0;
        }
        for (Season item : Season.values()) {
            if (item.ordinal() == position) {
                nextSeason = item;
            }
        }
        return nextSeason;
    }

    private static Season previous(Season season) {
        Season previousSeason = null;
        int position = season.ordinal() - 1;
        if (position < 0) {
            position = Season.values().length - 1;
        }
        for (Season item : Season.values()) {
            if (item.ordinal() == position) {
                previousSeason = item;
            }
        }
        return previousSeason;
    }
}
