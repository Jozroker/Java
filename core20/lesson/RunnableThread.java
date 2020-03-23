package mainPackage.core20.lesson;

import java.util.Scanner;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input count value: ");
            int count = sc.nextInt();
            int[] numbers = new int[count];
            numbers[0] = 1;
            numbers[1] = 1;
            for (int i = 2; i < count; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
            for (int i = count - 1; i >= 0; i--) {
                System.out.print(numbers[i]);
                if (i != 0) {
                    System.out.print(", ");
                    Thread.sleep(1000);
                }
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
