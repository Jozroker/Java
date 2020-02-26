package mainPackage.javaCore14.lesson.task2;

import javax.naming.Name;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Commodity> products = new HashSet<>();

        System.out.println("1 - Add commodity");
        System.out.println("2 - Remove commodity");
        System.out.println("3 - Change commodity");
        System.out.println("4 - Sort by name");
        System.out.println("5 - Sort by length");
        System.out.println("6 - Sort by width");
        System.out.println("7 - Sort by weight");
        System.out.println("8 - Output product info");
        System.out.println("9 - View products");
        System.out.println("0 - Exit");

        while(true) {
            try {
                System.out.print("Choose action: ");
                switch (sc.nextInt()) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        System.out.print("Enter product name: ");
                        String name = sc.next();
                        System.out.println("Enter product parameters (length width weight): ");
                        double length = sc.nextDouble();
                        double width = sc.nextDouble();
                        double weight = sc.nextDouble();
                        products.add(new Commodity(name, length, width, weight));
                        break;
                    case 2:
                        System.out.print("Enter product name: ");
                        name = sc.next();
                        Commodity removeCom = null;
                        for (Commodity product : products) {
                            if (product.getName().equals(name)) {
                                removeCom = product;
                            }
                        }
                        if (removeCom == null) {
                            System.out.println("List hasn't this product");
                        } else {
                            products.remove(removeCom);
                        }
                        break;
                    case 3:
                        System.out.print("Enter product name: ");
                        name = sc.next();
                        Commodity currentCom = null;
                        for (Commodity product : products) {
                            if (product.getName().equals(name)) {
                                currentCom = product;
                            }
                        }
                        if (currentCom == null) {
                            System.out.println("List hasn't this product");
                        } else {
                            System.out.print("Enter new product name: ");
                            name = sc.next();
                            currentCom.setName(name);
                            System.out.print("Enter new product length: ");
                            length = sc.nextDouble();
                            currentCom.setLength(length);
                            System.out.print("Enter new product width: ");
                            width = sc.nextDouble();
                            currentCom.setWidth(width);
                            System.out.print("Enter new product weight: ");
                            weight = sc.nextDouble();
                            currentCom.setWeight(weight);
                        }
                        break;
                    case 4:
                        List<Commodity> NameSortedProducts = new ArrayList<>(products);
                        NameSortedProducts.sort(new NameComparator());
                        System.out.println(NameSortedProducts);
                        break;
                    case 5:
                        List<Commodity> LengthSortedProduct = new ArrayList<>(products);
                        LengthSortedProduct.sort(new LengthComparator());
                        System.out.println(LengthSortedProduct);
                        break;
                    case 6:
                        List<Commodity> WidthSortedProduct = new ArrayList<>(products);
                        WidthSortedProduct.sort(new WidthComparator());
                        System.out.println(WidthSortedProduct);
                        break;
                    case 7:
                        List<Commodity> WeightSortedProduct = new ArrayList<>(products);
                        WeightSortedProduct.sort(new WeightComparator());
                        System.out.println(WeightSortedProduct);
                        break;
                    case 8:
                        System.out.print("Input product position: ");
                        int position = sc.nextInt();
                        List<Commodity> listProducts = new ArrayList<>(products);
                        if (position > listProducts.size() - 1) {
                            System.out.println("Incorrect position");
                        } else {
                            System.out.println(listProducts.get(position).toString());
                        }
                        break;
                    case 9:
                        System.out.println(products.toString());
                        break;
                    default:
                        System.out.println("Incorrect value. Try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value. Try again");
                sc.next();
            }
        }
    }
}
