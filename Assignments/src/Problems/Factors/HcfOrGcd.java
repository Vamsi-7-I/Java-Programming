package Problems.Factors;

import java.util.Scanner;

public class HcfOrGcd {
    // highest common factor / greatest common divisor
    // logic1

    /*public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int max = 0;
        int n = (num1 >= num2) ? num1 : num2;
        for(int i = 1;i <= n;i++){
            if(num1 % i == 0 && num2 % i == 0){
                max = i;
            }
        }
        System.out.println("The H.C.F or G.C.D is " + max);
    }*/

    // logic2 - successive division

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        while(num1 % num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        System.out.println("The H.C.F or G.C.D is " + num2);
    }
}
