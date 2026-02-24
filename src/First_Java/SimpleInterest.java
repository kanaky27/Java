package First_Java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal : ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate : ");
        double r = sc.nextDouble();
        System.out.print("Enter the time : ");
        double t = sc.nextDouble();
        double si;
        si = (p*r*t)/100 ;
        System.out.println("Simple Interest : Rs. " + si);


    }
}
