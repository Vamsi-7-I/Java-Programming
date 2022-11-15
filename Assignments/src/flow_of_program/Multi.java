package flow_of_program;

import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int upto = scn.nextInt();
        for(int i = 1;i <= upto;i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
