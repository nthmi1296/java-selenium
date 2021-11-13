package L02.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class EX01 {
    /**
     * Given an array from user input
     * Return the index of the max/min number from the array
     * Note: We ignore the case we have more than one maximum/minimum number
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

        // 3. Find index of the max/min number
        int max = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[max] < arr[idx]) {
                max = idx;
            }
        }
        System.out.println("Index of max number is a[" + max + "]");


        int min = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[min] > arr[idx]) {
                min = idx;
            }
        }
        System.out.println("Index of max number is a[" + min + "]");
    }
}
