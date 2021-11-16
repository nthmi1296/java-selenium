package L04;

import java.util.Scanner;

public class EX03 {
    /**
     * String myStr = "100 minutes";
     * NOT using REGEX, extract digit character from that String
     * Expected output: "100".
     * EX: "12345n678" -> "12345678"
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] allChar = input.toCharArray();
        String output = "";

        for (char c : allChar) {
            if (Character.isDigit(c)) {
                output = output + c;
            }
        }
        System.out.println("Output: " + output);
    }
}
