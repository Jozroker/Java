package mainPackage.core24.lesson;

import java.util.Objects;

public class Time {

    private int min;
    private int hour;

    public Time(int hour, int min) {
        if ((min < 0 && min >= 60) || (hour < 0 && hour >= 24)) {
            System.out.println("Incorrect time value");
        } else {
            this.min = min;
            this.hour = hour;
        }
    }

    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return min == time.min &&
                hour == time.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, hour);
    }

    @Override
    public String toString() {
        return hour + ":" + min;
    }
}
