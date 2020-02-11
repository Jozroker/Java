package mainPackage.javaCore11.lesson.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean state = true;
        String[] materials = {"leather", "alkantara", "plastmas", "silicon"};
        Arrays.sort(materials);
        int one = random.nextInt(9) + 1;
        int two = random.nextInt(9) + 1;
        Auto[][] autos = new Auto[one][two];
        for (int i = 0; i < one; i++) {
            for (int j = 0; j <two; j++) {
                autos[i][j] = new Auto(random.nextInt(600) + 400, random.nextInt(20) + 2000, random.nextDouble() * 10, materials[random.nextInt(3)], random.nextInt(4) + 4);
            }
        }
        while(state) {
            System.out.println("0 - Output autos array");
            System.out.println("1 - Set similar value for all cars");
            System.out.println("2 - Quit");
            int value = sc.nextInt();
            switch (value) {
                case 0:
                    System.out.println(Arrays.deepToString(autos));
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
                            for (int i = 0; i < one; i++) {
                                for (int j = 0; j < two; j++) {
                                    autos[i][j].setHorsesPower(hp);
                                }
                            }
                            break;
                        case 1:
                            System.out.print("Input autos year: ");
                            int year = sc.nextInt();
                            for (int i = 0; i < one; i++) {
                                for (int j = 0; j < two; j++) {
                                    autos[i][j].setYear(year);
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Input helm diameter: ");
                            double hd = sc.nextDouble();
                            for (int i = 0; i < one; i++) {
                                for (int j = 0; j < two; j++) {
                                    autos[i][j].setHelmDiameter(hd);
                                }
                            }
                            break;
                        case 3:
                            System.out.println(Arrays.toString(materials));
                            System.out.print("Input helm material: ");
                            String mt = sc.nextLine();
                            try {
                                Arrays.binarySearch(materials, mt);
                                for (int i = 0; i < one; i++) {
                                    for (int j = 0; j < two; j++) {
                                        autos[i][j].setHelmMaterial(mt);
                                    }
                                }
                            } catch (ClassCastException e) {
                                System.out.println("Undefined material");
                            }
                            break;
                        case 4:
                            System.out.print("Input cylinders quantity: ");
                            int cq = sc.nextInt();
                            for (int i = 0; i < one; i++) {
                                for (int j = 0; j < two; j++) {
                                    autos[i][j].setEngineCylinderQuantity(cq);
                                }
                            }
                            break;
                        default:
                            System.out.println("Exception. Undefined value. Try again!");
                    }
                    break;
                case 2:
                    state = false;
                    break;
                default:
                    System.out.println("Exception. Undefined value. Try again!");
            }
        }
    }
}
