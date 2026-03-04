package Conditionals_Loops;

import java.util.Scanner;

public class NCR_NPR {

    // Method to calculate factorial
    static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter value of r: ");
        int r = sc.nextInt();

        if (r > n) {
            System.out.println("r cannot be greater than n");
        } else {
            long nPr = factorial(n) / factorial(n - r);
            long nCr = factorial(n) / (factorial(r) * factorial(n - r));

            System.out.println("nPr = " + nPr);
            System.out.println("nCr = " + nCr);
        }

        sc.close();
    }
}
