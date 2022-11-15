package Problems.Factors;

import java.util.Scanner;

public class CommonFactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.print("The common factors are ");
        int n = (num1 >= num2) ? num1 : num2;
        for(int i = 1;i <= n;i++){
            if(num1 % i == 0 && num2 % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
