package Problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Q: fibonnaci number at nth number
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = 0,c = 1;
        int count = 2;
        while(count <= n){
            int temp = c;
            c = c + p;
            p = temp;
            count++;
        }
        System.out.println(c);
    }
}
