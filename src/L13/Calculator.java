package L13;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // num1: 2
        // num2: 1

        // --> 2

        Scanner scanner = new Scanner(System.in);

        System.out.print("Num 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Num 2: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("/ by zero");
        } finally {
            System.out.println("Thank you!!");
        }

    }
}
