package first_java;

import java.util.Scanner;

public class SimpleInterest {
    // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    // T in years , R in % , P in dollars
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the principal ");
        int P = scn.nextInt();
        System.out.print("Enter the time ");
        int T = scn.nextInt();
        System.out.print("Enter the rate ");
        int R = scn.nextInt();
        int S_I = (P * T * R) / 100;
        System.out.println("The Simple Interest is " + S_I);
        int amount = P + S_I;
        System.out.println("The total amount to be paid is " + amount);
    }
}
