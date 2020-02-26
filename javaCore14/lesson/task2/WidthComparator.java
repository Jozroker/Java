package mainPackage.javaCore14.lesson.task2;

import java.util.Comparator;

public class WidthComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        return Double.compare(o1.getWidth(), o2.getWidth());
    }

}
