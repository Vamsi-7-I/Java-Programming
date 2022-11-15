package flow_of_program;

import java.util.Scanner;

public class XStop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = 1,num = 0;
        System.out.print("Enter a letter to quit or enter num" + i + " = ");
        int sum = 0;
        while(scn.hasNextInt() ){
            num = scn.nextInt();
            sum += num;
            i++;
            System.out.print("Enter num" + i + " = ");
        }
        System.out.println("sum = " + sum);
    }
}
