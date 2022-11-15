package Conditional_loops;

import java.util.Scanner;

public class Cylinder {
    // Volume Of Cylinder
    // Curved Surface Area Of Cylinder
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int radius = scn.nextInt();
        int height = scn.nextInt();
        double pi = 3.14159;
        double volume = pi * radius * radius * height;
        double csa = 2 * pi * radius * height;
        System.out.println("Volume of cylinder is " + volume);
        System.out.println("CSA of cyloinder is " + csa);
    }
}
