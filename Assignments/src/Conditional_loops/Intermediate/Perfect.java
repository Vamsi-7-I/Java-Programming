package Conditional_loops.Intermediate;

import java.util.Scanner;

public class Perfect {
    // Perfect Number In Java
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int res = 0;
        for(int i = 1;i < num;i++){
            if(num % i == 0){
                res += i;
            }
        }
        System.out.println( res == num);
    }
}
