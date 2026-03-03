package Conditionals_Loops;

import java.util.Scanner;

public class Volume {

    static double cone(double r, double h) {
        return (1.0/3) * Math.PI * r * r * h;
    }

    static double prism(double baseArea, double h) {
        return baseArea * h;
    }

    static double cylinder(double r, double h) {
        return Math.PI * r * r * h;
    }

    static double sphere(double r) {
        return (4.0/3) * Math.PI * r * r * r;
    }

    static double pyramid(double baseArea, double h) {
        return (1.0/3) * baseArea * h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cone
        System.out.println("Enter radius and height of cone:");
        double r1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        System.out.println("Volume of Cone: " + cone(r1, h1));

        // Prism
        System.out.println("\nEnter base area and height of prism:");
        double baseArea1 = sc.nextDouble();
        double h2 = sc.nextDouble();
        System.out.println("Volume of Prism: " + prism(baseArea1, h2));

        // Cylinder
        System.out.println("\nEnter radius and height of cylinder:");
        double r2 = sc.nextDouble();
        double h3 = sc.nextDouble();
        System.out.println("Volume of Cylinder: " + cylinder(r2, h3));

        // Sphere
        System.out.println("\nEnter radius of sphere:");
        double r3 = sc.nextDouble();
        System.out.println("Volume of Sphere: " + sphere(r3));

        // Pyramid
        System.out.println("\nEnter base area and height of pyramid:");
        double baseArea2 = sc.nextDouble();
        double h4 = sc.nextDouble();
        System.out.println("Volume of Pyramid: " + pyramid(baseArea2, h4));
    }
}