package mainPackage.javaCore14.lesson.task1;

import java.util.Comparator;

public class NameComparator implements Comparator<Users> {

    @Override
    public int compare(Users u1, Users u2) {
        return u1.getName().compareTo(u2.getName());
    }
}
