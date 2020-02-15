package mainPackage.javaCore14.lesson.task1;

import java.util.Comparator;

public class AgeComparator implements Comparator<Users> {

    @Override
    public int compare(Users u1, Users u2) {
        if(u1.getAge() == u2.getAge()) {
            return 0;
        } else if(u1.getAge() > u2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
