/*
 * Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum of every digit in that number raised to the power of total digits in that number is equal to the number. 
Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy) 
Input1 : 153 
Output1 : Yes 
Input 2 : 134 
Output2 : No
 */

import java.util.Scanner;

public class RecursionQues5 {
    public static int countDigit(int num){
        if(num == 0) return 0;
        else{
            return 1 + countDigit(num/10);
        }
    }
    
    public static int sumOfPower(int num, int digits) {
        if (num == 0) {
            return 0;
        } else {
            int one_digit = num % 10;
            return (int) Math.pow(one_digit, digits) + sumOfPower(num / 10, digits);
        }
    }

    public static boolean isArmstrong(int num){
        int digit = countDigit(num);
        int powSum = sumOfPower(num, digit);

        if(num == powSum) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Yes it is a armstrong number");
        }else{
            System.out.println("No it is not a armstrong number");
        }
    }
}
