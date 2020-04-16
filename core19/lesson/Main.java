package mainPackage.core19.lesson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File file = new File("F:\\PC_Educate\\Programming\\java\\newProject\\src\\mainPackage\\core19\\lesson\\file.txt");

        Employee employee1 = new Employee(1, "Oleg", 8500);
        Methods.serialize(file, employee1);
        for (Object o : Methods.deserialize(file)) {
            System.out.println(o.toString());
        }
        System.out.println();

        List<Employee> collection = new ArrayList<>();
        collection.add(new Employee(2, "Nick", 5000.9));
        collection.add(new Employee(3, "Pedro", 6000));
        collection.add(new Employee(4, "Maria", 2200.2));
        collection.add(new Employee(5, "Jack", 10600));

        Methods.serialize(file, collection.toArray());
        for (Object o : Methods.deserialize(file)) {
            System.out.println(o.toString());
        }
    }
}
