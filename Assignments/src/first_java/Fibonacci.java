package first_java;

import java.util.Scanner;

public class Fibonacci {
    // To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int a = 0,b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 2;i <= num;i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
