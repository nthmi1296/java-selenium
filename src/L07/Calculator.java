package L07;

public class Calculator {

    // method signature
//    public static int sum(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int sum(int num1, int num2, int num3) {
//        return num1 + num2 + num3;
//    }

    // Rest parameters | Varargs
    public int sum(int... nums) {
        System.out.println("Length: " + nums.length);
        int total = 0;
        for (int num : nums) {
            total = total + num;
        }
        return total;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1, 2);
        calculator.sum(1, 2, 3);
        calculator.sum(1, 2, 3, 4, 5);
    }
}
