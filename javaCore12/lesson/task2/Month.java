package mainPackage.javaCore12.lesson.task2;

public class Month {
//    JANUARY(31, Season.WINTER),
//    FEBRUARY(29, Season.WINTER),
//    MARCH(31, Season.SPRING),
//    APRIL(30, Season.SPRING),
//    MAY(31, Season.SPRING),
//    JUNE(30, Season.SUMMER),
//    JULY(31, Season.SUMMER),
//    AUGUST(31, Season.SUMMER),
//    SEPTEMBER(30, Season.OUTUMN),
//    OCTOBER(31, Season.OUTUMN),
//    NOVEMBER(30, Season.OUTUMN),
//    DECEMBER(31, Season.WINTER);

    private int day;
    private Season season;
    private String month;

    public Month(int day, String month, Season season) {
        this.day = day;
        this.season = season;
        this.month = month;
    }


    public int getDay() {
        return day;
    }

    public Season getSeason() {
        return season;
    }

    public String getMonth() {
        return month;
    }
}
