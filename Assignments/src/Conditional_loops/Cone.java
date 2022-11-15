package Conditional_loops;

import java.util.Scanner;

public class Cone {
    // Volume Of Cone Java Program
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int radius = scn.nextInt();
        int height = scn.nextInt();
        double pi = 3.14157;
        double volume = (pi * radius * radius * height) / 3;
        System.out.println("Volume of cone is " + volume);
    }
}
