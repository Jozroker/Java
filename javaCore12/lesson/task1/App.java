package mainPackage.javaCore12.lesson.task1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean state = true;
        List<String> materials = new ArrayList<>();
        materials.add("leather");
        materials.add("alkantara");
        materials.add("plastmas");
        materials.add("silicon");
        int one = random.nextInt(9) + 1;
        int two = random.nextInt(9) + 1;
        List<List<Auto>> autos = new ArrayList<>();
        for (int i = 0; i < one; i++) {
            List<Auto> autos2 = new ArrayList<>();
            for (int j = 0; j < two; j++) {
                autos2.add(new Auto(random.nextInt(600) + 400, random.nextInt(20) + 2000, random.nextDouble() * 10, materials.get(random.nextInt(materials.size() - 1)), random.nextInt(4) + 4));
            }
            autos.add(autos2);
        }
        while (state) {
            System.out.println("0 - Output autos array");
            System.out.println("1 - Set similar value for all cars");
            System.out.println("2 - Add helm material");
            System.out.println("3 - Rebuilt autos array");
            System.out.println("4 - Quit");
            int value = sc.nextInt();
            switch (value) {
                case 0:
                    for (int a = 0; a < one - 1; a++) {
                        for (int b = 0; b < two - 1; b++) {
                            System.out.println(autos.get(a).get(b));
                        }
                    }
                    break;
                case 1:
                    System.out.println("Choose field to fill:");
                    System.out.println("0 - Horses Power");
                    System.out.println("1 - Year");
                    System.out.println("2 - Helm Diameter");
                    System.out.println("3 - Helm Material");
                    System.out.println("4 - Cylinders Quantity");
                    int subvalue = sc.nextInt();
                    switch (subvalue) {
                        case 0:
                            System.out.print("Input horses power: ");
                            int hp = sc.nextInt();
                            for (int i = 0; i < one - 1; i++) {
                                for (int j = 0; j < two - 1; j++) {
                                    autos.get(i).get(j).setHorsesPower(hp);
                                }
                            }
                            break;
                        case 1:
                            System.out.print("Input autos year: ");
                            int year = sc.nextInt();
                            for (int i = 0; i < one - 1; i++) {
                                for (int j = 0; j < two - 1; j++) {
                                    autos.get(i).get(j).setYear(year);
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Input helm diameter: ");
                            try {
                                double hd = sc.nextDouble();
                                for (int i = 0; i < one - 1; i++) {
                                    for (int j = 0; j < two - 1; j++) {
                                        autos.get(i).get(j).setHelmDiameter(hd);
                                    }
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Number is incorrect");
                            }
                            break;
                        case 3:
                            System.out.println(materials);
                            Scanner sc2 = new Scanner(System.in);
                            System.out.print("Input helm material: ");
                            String mt = sc2.nextLine();
                            if (materials.contains(mt)) {
                                for (int i = 0; i < one - 1; i++) {
                                    for (int j = 0; j < two - 1; j++) {
                                        autos.get(i).get(j).setHelmMaterial(mt);
                                    }
                                }
                            } else {
                                System.out.println("Undefined material");
                            }
                            break;
                        case 4:
                            System.out.print("Input cylinders quantity: ");
                            int cq = sc.nextInt();
                            for (int i = 0; i < one - 1; i++) {
                                for (int j = 0; j < two - 1; j++) {
                                    autos.get(i).get(j).setEngineCylinderQuantity(cq);
                                }
                            }
                            break;
                        default:
                            System.out.println("Exception. Undefined value. Try again!");
                    }
                    break;
                case 2:
                    System.out.println("Enter material: " + sc.nextLine());
                    Scanner scanner = new Scanner(System.in);
                    String addMaterial = scanner.nextLine();
                    materials.add(addMaterial);
                    break;
                case 3:
                    one = random.nextInt(9) + 1;
                    two = random.nextInt(9) + 1;
                    autos.clear();
                    for (int i = 0; i < one; i++) {
                        ArrayList<Auto> autos2 = new ArrayList<Auto>();
                        for (int j = 0; j < two; j++) {
                            autos2.add(new Auto(random.nextInt(600) + 400, random.nextInt(20) + 2000, random.nextDouble() * 10, materials.get(random.nextInt(materials.size() - 1)), random.nextInt(4) + 4));
                        }
                        autos.add(autos2);
                    }
                    System.out.println("Rebuilt is successful");
                    break;
                case 4:
                    state = false;
                    break;
                default:
                    System.out.println("Exception. Undefined value. Try again!");
            }
        }
    }
}
