package Conditional_loops;

import java.util.Scanner;

public class Triangle {
    // Area Of Triangle
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int height = scn.nextInt();
        int area = (base * height) / 2;
        System.out.println("Area of triangle is " + area);
    }
}
