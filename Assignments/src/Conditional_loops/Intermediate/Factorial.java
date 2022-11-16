package Conditional_loops.Intermediate;

import java.util.Scanner;

public class Factorial {
    // Factorial Program In Java
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact = 1;
        while(n > 0){
            fact = fact * n;
            n--;
        }
        System.out.println("The factorial of given number is " + fact);
    }
}
