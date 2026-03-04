package Conditionals_Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        long fact = 1;
        if(n == 0 || n == 1){
            System.out.println(n + "! = " + 1);
        }
        else{
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println(n + "! = "+ fact);
        }

    }
}
