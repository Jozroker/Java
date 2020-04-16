package mainPackage.core23.lesson.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Zooclub {

    private Scanner sc = new Scanner(System.in);
    private Map<Person, List<Animal>> clubMembers = new HashMap<>();

    public void addMember() {
        System.out.print("Enter person name: ");
        String name = sc.next();
        System.out.print("Enter person age: ");
        int age = sc.nextInt();
        clubMembers.put(new Person(name, age), new ArrayList<>());
    }

    public void removeMember() {
        System.out.print("Enter person name: ");
        String name = sc.next();
        if (clubMembers.entrySet().stream().anyMatch(member -> member.getKey().getName().equals(name))) {
            clubMembers.entrySet().removeIf(member -> member.getKey().getName().equals(name));
        } else {
            System.out.println("Zooclub hasn't such member");
        }
    }

    public void addMemberPet() {
        System.out.print("Enter person name: ");
        String name = sc.next();
        if (clubMembers.entrySet().stream().anyMatch(member -> member.getKey().getName().equals(name))) {
            clubMembers.forEach((key, value) -> {
                if (key.getName().equals(name)) {
                    System.out.print("Enter pet name: ");
                    String petName = sc.next();
                    while (true) {
                        System.out.print("Enter pet type: ");
                        String petType = sc.next();
                        if (petType.equals("cat") || petType.equals("dog")) {
                            value.add(new Animal(petName, petType));
                            break;
                        } else {
                            System.out.println("Incorrect pet type. Try again");
                        }
                    }
                }
            });
        } else {
            System.out.println("Zooclub hasn't such member");
        }
    }

    public void removeMemberPet() {
        System.out.print("Enter person name: ");
        String name = sc.next();
        if (clubMembers.entrySet().stream().anyMatch(member -> member.getKey().getName().equals(name))) {
            clubMembers.forEach((key, value) -> {
                if (key.getName().equals(name)) {
                    System.out.print("Enter pet name: ");
                    String petName = sc.next();
                    if (value.stream().anyMatch(pet -> pet.getName().equals(petName))) {
                        value.removeIf(pet -> pet.getName().equals(petName));
                    } else {
                        System.out.println("This member hasn't such pet");
                    }
                }
            });
        } else {
            System.out.println("Zooclub hasn't such member");
        }
    }

    public void removePetFromAllMembers() {
        System.out.print("Enter pet name: ");
        String petName = sc.next();
        while (true) {
            System.out.print("Enter pet type: ");
            String petType = sc.next();
            if (petType.equals("cat") || petType.equals("dog")) {
                clubMembers.values().forEach(petList -> petList.removeIf(pet -> (pet.getName().equals(petName) && pet.getType().equals(petType))));
                break;
            } else {
                System.out.println("Incorrect pet type. Try again");
            }
        }
    }

    @Override
    public String toString() {
        String value = "";
        if (clubMembers.isEmpty()) {
            value = "Zooclub hasn't members";
        } else {
            value = "Zooclub{\n" +
                    clubMembers.entrySet().stream()
                            .map(elem -> {
                                return elem.getKey().toString() + "\n    Pets: " + elem.getValue().toString();
                            })
                            .collect(Collectors.joining("\n")) +
                    '}';
        }
        return value;
    }
}
