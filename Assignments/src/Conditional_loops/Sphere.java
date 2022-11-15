package Conditional_loops;

import java.util.Scanner;

public class Sphere {
    // Volume Of Sphere
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int radius = scn.nextInt();
        double pi = 3.14159;
        double volume = (4 * pi * Math.pow(radius,3)) / 3;
        System.out.println("Volume of sphere is " + volume);
    }
}
