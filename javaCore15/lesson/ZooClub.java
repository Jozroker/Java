package mainPackage.javaCore15.lesson;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ZooClub {
    private Map<Person, List<Pet>> map;
    private Scanner sc = new Scanner(System.in);

    public ZooClub(Map<Person, List<Pet>> map) {
        this.map = map;
    }

    public void newClubMember(String name, int age) {
        map.put(new Person(name, age), new ArrayList<Pet>());
    }

    public void newClubMemberPet(Person person) {
        boolean isAnimalType = false;
        if (map.containsKey(person)) {
            for (Map.Entry<Person, List<Pet>> elem : map.entrySet()) {
                if (elem.getKey() == person) {
                    System.out.println("Input pet name: ");
                    String petName = sc.next();
                    System.out.println("input pet type: ");
                    String petType = sc.next();
                    try {
                        elem.getValue().add(new Pet(AnimalType.valueOf(petType.toUpperCase()), petName));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Incorrect animal type value");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Person not exist in club...");
        }
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                map +
                '}';
    }
}
