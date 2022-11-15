package Conditional_loops;

import java.util.Scanner;

public class LargestX {
    // Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(true){
            int n = scn.nextInt();
            if(n == 0){
                break;
            }
            else{
                max = Math.max(max,n);
                System.out.println(max);
            }
        }
        System.out.println("The maximum number is " + max);
    }
}
