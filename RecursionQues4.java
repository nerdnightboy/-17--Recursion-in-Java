/*
 * Find the sum of the values of the array [92, 23, 15, -20, 10].
 */

import java.util.Scanner;

public class RecursionQues4 {
    public static int sumValue(int[] arr, int idx) {
        int n = arr.length;
        if (idx == n - 1) {
            return arr[idx];
        } else {
            return arr[idx] + sumValue(arr, idx + 1);
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
        System.out.println("The sum of values inside the array is : " + sumValue(arr, 0));
    }
}
