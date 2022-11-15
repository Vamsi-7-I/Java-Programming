package first_java;

import java.util.Scanner;

public class Armstrong {
    // To find Armstrong Number between two given number.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int res = 0;
        int original = num;
        while(num > 0){
            int rem = num % 10;
            res += rem * rem * rem;
            num = num / 10;
        }
        System.out.println(res == original);
    }
}
