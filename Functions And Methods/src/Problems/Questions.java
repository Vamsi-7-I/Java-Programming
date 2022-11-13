package Problems;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        for(int i = 100;i < 1000;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int num1 = scn.nextInt();
        System.out.print("Enter a 3 digit number = ");
        int num2 = scn.nextInt();
        boolean primeOrNot = isPrime(num1);
        boolean isArmstrongOrNot = isArmstrong(num2);
        System.out.println("Is Prime : " + primeOrNot);
        System.out.println("Is Armstrong: " + isArmstrongOrNot);
    }
    static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isArmstrong(int num){
        int original = num;
        int res = 0;
        while(num > 0){
            int rem = num % 10;
            res = res + (rem * rem * rem);
            num = num / 10;
        }
        return res == original;
    }
}
