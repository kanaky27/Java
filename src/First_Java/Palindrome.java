package First_Java;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove spaces and convert to lowercase
        str = str.trim().toLowerCase();

        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}