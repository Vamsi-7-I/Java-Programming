package Conditional_loops;

import java.util.Scanner;

public class Pyramid {
    // Volume Of Pyramid
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int width = scn.nextInt();
        int height = scn.nextInt();
        double volume = (length * width * height) / 3;
        System.out.println("Area of triangle is " + volume);
    }
}
