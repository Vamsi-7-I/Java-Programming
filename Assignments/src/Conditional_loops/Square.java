package Conditional_loops;

import java.util.Scanner;

public class Square {
    // Perimeter Of Square
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int side = scn.nextInt();
        int perimeter = 4 * side;
        System.out.println("The perimeter of square is " + perimeter);
    }
}
