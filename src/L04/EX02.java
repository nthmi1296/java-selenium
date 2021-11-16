package L04;

import java.util.Scanner;

public class EX02 {
    /**
     * String myPassword = "password123";
     * Allow user to input maximum 3 times
     */
    public static void main(String[] args) {

        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);

        int inputTime = 0;
        final int MAX = 3;
        do
        {
            System.out.print("Enter Password: ");
            String pwd = scanner.next();
            if (pwd.equals(myPassword)) {
                System.out.println("You are all set!");
                break;
            } else {
                System.out.println("Fail !!");
            }
            inputTime++;
        }while(inputTime<MAX);
        System.out.println("Try later!!!");
    }
}
