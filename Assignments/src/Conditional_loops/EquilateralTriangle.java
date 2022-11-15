package Conditional_loops;

import java.util.Scanner;

public class EquilateralTriangle {
    // Area Of Equilateral Triangle
    // Perimeter Of Equilateral Triangle
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int side = scn.nextInt();
        double area = areaOfET(side);
        int perimeter = perimeterOfET(side);
        System.out.println("Area of equilateral triangle is " + area);
        System.out.println("Perimeter of equilateral triangle is " + perimeter);
    }

    public static double areaOfET(int side){
        double area = (Math.sqrt(3) * side * side) / 4;
        return area;
    }

    public static int perimeterOfET(int side){
        int area = 3 * side;
        return area;
    }
}
