package L02.LAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EX02 {

    /**
     * Given an array from user input
     * Find out the average value from the array
     * Bonus credit: Follow this to round up the number to 2 floating number
     * Link: https://blog.sdetpro.com/blog/simple-way-to-round-double-or-float-value.html
     */

    public static void main(String[] args) {

        // 1. Enter the number of elements
        System.out.print("Enter the number of elements: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        // 2. Enter element
        for (int idx = 0; idx < length; idx++) {
            System.out.print("Enter a[" + idx + "]: ");
            arr[idx] = scanner.nextInt();
        }

        // 3. Find out average
        double total = 0;
        for (int value : arr) {
            total = total + value;
        }
        System.out.println("Total is: " + total);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double avg = total / arr.length;
        System.out.println("Original number: " + avg);
        System.out.println("Format number: " + decimalFormat.format(avg));

    }
}
