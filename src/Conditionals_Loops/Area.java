package Conditionals_Loops;

import java.util.Scanner;

public class Area {

    // Area of Circle
    static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Triangle (1/2 * base * height)
    static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Area of Rectangle (length * width)
    static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // Area of Isosceles Triangle
    static double areaOfIsoscelesTriangle(double base, double side) {
        double height = Math.sqrt((side * side) - (base * base / 4));
        return 0.5 * base * height;
    }

    // Area of Parallelogram (base * height)
    static double areaOfParallelogram(double base, double height) {
        return base * height;
    }

    // Area of Rhombus (1/2 * d1 * d2)
    static double areaOfRhombus(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    // Area of Equilateral Triangle
    static double areaOfEquilateralTriangle(double side) {
        return (Math.sqrt(3) / 4) * side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();
        System.out.println("Area of Circle = " + areaOfCircle(r));

        System.out.println("Enter base and height of triangle:");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area of Triangle = " + areaOfTriangle(b, h));

        System.out.println("Enter length and width of rectangle:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        System.out.println("Area of Rectangle = " + areaOfRectangle(l, w));

        System.out.println("Enter base and equal side of isosceles triangle:");
        double baseIso = sc.nextDouble();
        double sideIso = sc.nextDouble();
        System.out.println("Area of Isosceles Triangle = " + areaOfIsoscelesTriangle(baseIso, sideIso));

        System.out.println("Enter base and height of parallelogram:");
        double basePara = sc.nextDouble();
        double heightPara = sc.nextDouble();
        System.out.println("Area of Parallelogram = " + areaOfParallelogram(basePara, heightPara));

        System.out.println("Enter diagonals of rhombus:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Area of Rhombus = " + areaOfRhombus(d1, d2));

        System.out.println("Enter side of equilateral triangle:");
        double sideEq = sc.nextDouble();
        System.out.println("Area of Equilateral Triangle = " + areaOfEquilateralTriangle(sideEq));

        sc.close();
    }
}

