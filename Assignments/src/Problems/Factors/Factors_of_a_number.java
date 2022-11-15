package Problems.Factors;

import java.util.Scanner;

public class Factors_of_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = scn.nextInt();
        System.out.print("The factors of " + num + " are ");
        for(int i = 1;i <= num;i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
