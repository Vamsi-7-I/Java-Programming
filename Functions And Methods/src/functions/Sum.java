package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // functions
        /*
            access_modifier keywords return_type fn_name(){
                    // main body
            }
        */
        //int sum = add();
        int add = sum(12,10);
        System.out.println("The sum of num1 and num2 = " + add);
    }

    // passing values to the method when calling
    static int sum(int a, int b){
        return a + b;
    }

    static int add(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the num1 = ");
        int num1 = scn.nextInt();
        System.out.print("Enter the num2 = ");
        int num2 = scn.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
