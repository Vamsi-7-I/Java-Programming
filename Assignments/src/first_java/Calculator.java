package first_java;

import java.util.Scanner;

public class Calculator {
    // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = scn.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = scn.nextInt();
        int sum = add(num1,num2);
        int difference = sub(num1,num2);
        int product = mul(num1,num2);
        int division = div(num1,num2);
        System.out.println("The sum of num1 and num2 is " + sum);
        System.out.println("The difference of num1 and num2 is " + difference);
        System.out.println("The product of num1 and num2 is " + product);
        System.out.println("The division of num1 and num2 is " + division);
    }

    public static int add(int a,int b){
        return a + b;
    }

    public static int sub(int a,int b){
        return a - b;
    }

    public static int mul(int a,int b){
        return a * b;
    }

    public static int div(int a,int b){
        return a / b;
    }
}
