package first_java;

import java.util.Scanner;

public class Largest {
    // Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        if(num1 == num2){
            System.out.println("both are equal");
        }
        else if(num1 > num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
}
