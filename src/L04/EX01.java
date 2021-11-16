package L04;

import java.util.Scanner;

public class EX01 {
    /**
     * Given input string: "2hrs and 5 minutes"
     * Please calculate how many minutes in total
     */
    public static void main(String[] args) {

        String orgTime = "2hrs and 5 minutes";

        String[] h = orgTime.split("hrs and |hr and");
        int hour = Integer.parseInt(h[0]);

        String[] m = h[1].split(" minutes| minute");
        int min = Integer.parseInt(m[0]);

        int totalInMinutes = hour * 60 + min;

        System.out.println("Total in minutes of string [" + orgTime + "] is: " + totalInMinutes);

    }
}
