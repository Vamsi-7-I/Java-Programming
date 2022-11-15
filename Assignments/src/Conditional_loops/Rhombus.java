package Conditional_loops;

import java.util.Scanner;

public class Rhombus {
    // Area Of Rhombus
    // Perimeter Of Rhombus
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d1 = scn.nextInt();
        int d2 = scn.nextInt();
        int side = scn.nextInt();
        int area = (d1 * d2) / 2;
        int perimeter = 4 * side;
        System.out.println("Area of rhombus is " + area);
        System.out.println("Perimeter of rhombus is " + perimeter);
    }
}
