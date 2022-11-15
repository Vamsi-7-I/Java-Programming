package Conditional_loops;

import java.util.Scanner;

public class SumX {
    // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        while(true){
            int n = scn.nextInt();
            if(n == 0){
                break;
            }
            else{
                sum += n;
                System.out.print(sum + " ");
            }
        }
        System.out.println("The total sum is " + sum);
    }
}
