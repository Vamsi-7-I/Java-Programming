package Conditional_loops;

import java.util.Scanner;

public class Difference {
    // Subtract the Product and Sum of Digits of an Integer
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0,product = 1;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n = n / 10;
        }
        int difference = product - sum;
        System.out.println(difference);
    }
}
