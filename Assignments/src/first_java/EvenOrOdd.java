package first_java;

import java.util.Scanner;

public class EvenOrOdd {
    // Write a program to print whether a number is even or odd, also take input from the user.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is a even number");
        }
        else{
            System.out.println(num + " is a odd number");
        }
    }
}
