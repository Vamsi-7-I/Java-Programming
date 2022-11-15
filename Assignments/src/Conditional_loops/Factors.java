package Conditional_loops;

import java.util.Scanner;

public class Factors {
    // Input a number and print all the factors of that number (use loops).
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
