package mainPackage.core20.lesson;

import java.util.Scanner;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input count value: ");
            int count = sc.nextInt();
            int first = 1;
            int second = 1;
            System.out.print(first + ", ");
            Thread.sleep(1000);
            System.out.print(second + ", ");
            Thread.sleep(1000);
            for (int i = 2; i < count; i++) {
                int temp = first + second;
                System.out.print(temp);
                if (i != count - 1) {
                    System.out.print(", ");
                    Thread.sleep(1000);
                }
                first = second;
                second = temp;
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
