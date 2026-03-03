package Conditionals_Loops;

import java.util.Scanner;

public class Perimeter {
    static double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius ;
    }
    static double perimeterOfEquilateralTriangle(double side) {
        return 3 * side ;
    }
    static double perimeterOfParallelogram(double a, double b) {
        return 2 * (a + b) ;
    }
    static double perimeterOfRectangle(double l, double b) {
        return 2 * (l + b) ;
    }
    static double perimeterOfsquare(double side) {
        return 4 * side;
    }

    static double perimeterOfrhombus(double side) {
        return 4 * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();
        System.out.println("Perimeter of Circle: " + perimeterOfCircle(r));

        System.out.println("\nEnter side of equilateral triangle:");
        double side1 = sc.nextDouble();
        System.out.println("Perimeter: " + perimeterOfEquilateralTriangle(side1));

        System.out.println("\nEnter sides of parallelogram:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Perimeter: " + perimeterOfParallelogram(a, b));

        System.out.println("\nEnter length and breadth of rectangle:");
        double l = sc.nextDouble();
        double br = sc.nextDouble();
        System.out.println("Perimeter: " + perimeterOfRectangle(l, br));

        System.out.println("\nEnter side of square:");
        double side2 = sc.nextDouble();
        System.out.println("Perimeter: " + perimeterOfsquare(side2));

        System.out.println("\nEnter side of rhombus:");
        double side3 = sc.nextDouble();
        System.out.println("Perimeter: " + perimeterOfrhombus(side3));
    }
}

