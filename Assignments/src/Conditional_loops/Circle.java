package Conditional_loops;

import java.util.Scanner;

public class Circle {
    // Area Of Circle Java Program
    // Perimeter Of Circle
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int radius = scn.nextInt();
        double pi = 3.14159;
        double area = areaOfCircle(radius,pi);
        double perimeter = perimeterOfCircle(radius,pi);
        System.out.println("The area of circle is " + area);
        System.out.println("The perimeter of circle is " + perimeter);
    }

    public static double areaOfCircle(int radius,double pi){
        return pi * radius * radius;
    }

    public static double perimeterOfCircle(int radius,double pi){
        return 2 * pi * radius;
    }
}
