package Conditional_loops;

import java.util.Scanner;

public class Fibonacci {
    // Fibonacci Series In Java Programs
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int a = 0,b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= num; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
