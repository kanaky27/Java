package First_Java;

import java.util.Scanner;

// An Armstrong number (also called a narcissistic number) is a number that is equal to:
//The sum of its digits raised to the power of the total number of digits.

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        for(int num = start; num <= end; num++) {

            int temp = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            while(temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if(sum == num) {
                System.out.println(num);
            }
        }
    }
}
