package flow_of_program;

import java.util.Scanner;

public class LeapOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = scn.nextInt();
        if(year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }
        else if(year % 4 == 0){
            if(year % 100 != 0){
                System.out.println(year + " is a leap year");
            }
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
