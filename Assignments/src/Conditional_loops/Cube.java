package Conditional_loops;

import java.util.Scanner;

public class Cube {
    // Total Surface Area Of Cube
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int side = scn.nextInt();
        int tsa = 6 * side * side;
        System.out.println("TSA of cube is " + tsa);
    }
}
