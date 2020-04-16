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

    public void newClubMember() {
        System.out.print("Enter member name: ");
        String name = sc.next();
        System.out.print("Enter member age: ");
        int age = sc.nextInt();
        map.put(new Person(name, age), new ArrayList<Pet>());
    }

    public void newClubMemberPet() {
        boolean isAnimalType = false;
        System.out.print("Enter person name: ");
        String personName = sc.next();
        Person tempPerson = new Person(personName);
        if (map.containsKey(tempPerson)) {
            for (Map.Entry<Person, List<Pet>> elem : map.entrySet()) {
                if (elem.getKey().equals(tempPerson)) {
                    System.out.print("Input pet name: ");
                    String petName = sc.next();
                    System.out.print("input pet type: ");
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

    public void removeClubMemberPet() {
        System.out.print("Enter person name: ");
        String personName = sc.next();
        Person tempPerson = new Person(personName);
        if (map.containsKey(tempPerson)) {
            for (Map.Entry<Person, List<Pet>> elem : map.entrySet()) {
                if (elem.getKey().equals(tempPerson)) {
                    System.out.print("Input pet name: ");
                    String petName = sc.next();
                    Pet tempPet = new Pet(petName);
                    elem.getValue().remove(tempPet);
                }
            }
        } else {
            System.out.println("Person not exist in club...");
        }
    }

    public void removeClubMember() {
        System.out.print("Enter person name: ");
        String personName = sc.next();
        Person tempPerson = new Person(personName);
        map.remove(tempPerson);
    }

    public void removePetFromAllMembers(Pet pet) {
        for (Map.Entry<Person, List<Pet>> elem : map.entrySet()) {
            elem.getValue().remove(pet);
        }
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                map +
                '}';
    }
}
