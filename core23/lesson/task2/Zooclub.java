package mainPackage.core23.lesson.task2;

import java.util.*;

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

    public void addMemberPet() {
        System.out.print("Enter person name: ");
        String name = sc.next();
        if (clubMembers.containsKey(new Person(name))) {
            clubMembers.forEach((key, value) -> {
                if (key.equals(name)) {
                    System.out.print("Enter pet name: ");
                    String petName = sc.next();
                    System.out.print("Enter pet type: ");
                    String petType = "";
                    while (true) {
                        String type = sc.next();
                        if (type.equals("cat") || type.equals("dog")) {
                            petType = type;
                            break;
                        } else {
                            System.out.println("Incorrect pet type. Try again");
                            System.out.print("Enter pet type: ");
                        }
                    }
                    value.add(new Animal(petName, petType));
                }
            });
        } else {
            System.out.println("Zooclub hasn't such member");
        }
    }

    public void removeMemberPet() {
        System.out.print("Enter person name: ");
        String name = sc.next();
        if (clubMembers.containsKey(new Person(name))) {
            System.out.print("Enter pet name: ");
            String petName = sc.next();
            if (clubMembers.get(new Person(name)).stream()
                    .anyMatch(pet -> pet.getName().equals(petName))) {
                clubMembers.get(new Person(name)).removeIf(pet -> pet.getName().equals(petName));
            } else {
                System.out.println("Member " + name + " hasn't such pet");
            }
        } else {
            System.out.println("Zooclub hasn't such member");
        }
    }


    @Override
    public String toString() {
        return "Zooclub{\n" +
                clubMembers.entrySet().stream().map(elem -> {
                    return elem.getKey().toString() + "\n    " + elem.getValue().stream().map(e -> {
                        return e.toString() + "\n";
                    });
                }).toString() +
                '}';
    }
}
