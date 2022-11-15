package Conditional_loops;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // Area Of Rectangle Program
        // Perimeter Of Rectangle
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int breadth = scn.nextInt();
        int width = scn.nextInt();
        int area = length * breadth;
        int perimeter = 2 * length * width;
        System.out.println("Area of rectangle is " + area);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}
