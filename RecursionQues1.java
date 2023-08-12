/*
 * Given an integer, find out the sum of its digits using recursion.
Input: n = 1234
Output: 10
Explanation: 1+2+3+4=10
 */
import java.util.*;
public class RecursionQues1 {
    public static int sumOfDigit(int num){
        if(num == 0){
            return 0;
        }

        return (num % 10) + sumOfDigit(num / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("The sum of digits is : " + sumOfDigit(num));
    }
}