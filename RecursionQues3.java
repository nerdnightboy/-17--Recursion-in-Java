/*
 * Print the max value of the array [ 13, 1, -3, 22, 5].
 */

import java.util.Scanner;

public class RecursionQues3 {
    public static int maxValue(int[] arr, int idx) {
        int n = arr.length;
        if (idx == n - 1) {
            return arr[idx];
        } else {
            int maxIndex = maxValue(arr, idx + 1);
            return Math.max(arr[idx], maxIndex);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The max value inside the array is : " + maxValue(arr, 0));
    }
}
