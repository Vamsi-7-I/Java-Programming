package loops;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        // Q: Print "Hello World" 5 times
        /* System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World"); */

        // for loop
        /*
            Syntax:
            for(initialisation;condition;increment/decrement){
                    //body
            }
        */

        // Q: Print numbers 1 to 5
        for(int num = 1;num <= 5;num++){
            System.out.println(num);
        }

        // Q: Print numbers 1 to n
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            //System.out.println(i);
            System.out.println("Hello World");
        }

    }
}
