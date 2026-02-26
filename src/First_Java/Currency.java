package First_Java;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency in rupees: ");
        double n = sc.nextDouble();
        n = n / 91.05;
        System.out.printf("$ %.2f" , n);
    }
}
