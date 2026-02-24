package First_Java;

import java.util.*;
public class EvenOdd {
    static void modulo(int n){
        if(n % 2 == 0){
            System.out.println(n + " is an even number.");
        }
        else{
            System.out.println(n + " is an odd number.");
        }
    }
    static void bitwise(int n){
        if((n & 1) == 0){
            System.out.println(n + " is an even number.");
        }
        else{
            System.out.println(n + " is an odd number.");
        }
    }
    static void division(int n){
        if((n / 2) * 2 == n){
            System.out.println(n + " is an even number.");
        }
        else{
            System.out.println(n + " is an odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        modulo(n);
        bitwise(n);
        division(n);
    }
}
