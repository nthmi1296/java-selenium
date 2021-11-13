package L02.LAB;

public class EX03 {
    /**
     * Write a function to sort that array in ascending order (from min -> max)
     */

    public static void main(String[] args) {

        int[] arr = {9, 3, 6, 4, 1, 9, 8, 2, 3};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }
}
