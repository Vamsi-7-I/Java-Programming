package flow_of_program;

import java.util.Scanner;

public class LcmOrHcf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int product = num1 * num2;
        int lcm,hcf;
        while(num1 % num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        hcf = num2;
        lcm = product / hcf;
        System.out.println(lcm+ " " + hcf);
    }
}
