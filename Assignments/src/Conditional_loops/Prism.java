package Conditional_loops;

import java.util.Scanner;

public class Prism {
    // Volume Of Prism
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int height = scn.nextInt();
        int volume = (base * height);
        System.out.println("Volume of prism is " + volume);
    }
}
