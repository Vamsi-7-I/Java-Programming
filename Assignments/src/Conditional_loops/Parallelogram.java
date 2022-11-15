package Conditional_loops;

import java.util.Scanner;

public class Parallelogram {
    // Area Of Parallelogram
    // Perimeter Of Parallelogram
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int height = scn.nextInt();
        int side = scn.nextInt();
        int area = base * height;
        int perimeter = 2 * base * side;
        System.out.println("Area of parallelogram is " + area);
        System.out.println("perimeter of parallelogram is " + perimeter);
    }
}
