package L03;

import java.security.SecureRandom;
import java.util.Scanner;

public class MenuWithWhileLoop {

    public static void main(String[] args) {

        boolean isCont = true;

        while (isCont) {
            System.out.println("==========Awesome Program============");
            System.out.println("1. Check Even, Odd Number");
            System.out.println("2. Guessing game");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Your option: ");
            int userOpt = scanner.nextInt();

            if (userOpt == 1) {
                checkEvenOddNum();
            } else if (userOpt == 2) {
                guessingGame();
            } else if (userOpt == 0) {
                isCont = false;
            } else {
                System.out.println("Option not available!");
            }
        }
        System.out.println("See you next time!!!");
    }

    private static void checkEvenOddNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your number: ");
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println(input + " is Even Number");
        } else {
            System.out.println(input + " is Odd Number");
        }
    }

    private static void guessingGame() {

        // {0,...,9} random pickup 1 number
        // 3 times to guess

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arrLength = arr.length;
        int random = arr[new SecureRandom().nextInt(arrLength)];
        System.out.println("Random is: " + random);

        int guessTime = 0;
        final int MAX_GUESSING = 3;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your guessing number: ");
            int userNum = scanner.nextInt();
            if (userNum == random) {
                System.out.println("Hooray!!!");
                break;
            }
            guessTime++;
        } while (guessTime < MAX_GUESSING);
        System.out.println("3 times lose. Try later!");
    }
}
