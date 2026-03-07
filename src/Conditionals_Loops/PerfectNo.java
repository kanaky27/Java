package Conditionals_Loops;

// A Perfect Number is a number that is equal to the sum of its proper divisors (excluding the number itself).

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= num/2; i++) {
            if(num % i == 0) {
                sum = sum + i;
            }
        }

        if(sum == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }
    }
}
