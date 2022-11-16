package Conditional_loops.Intermediate;

import java.util.Scanner;

public class Vowel {
    // Java Program Vowel Or Consonant
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().trim().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
                || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("The given character is a Vowel");
        }
        else{
            System.out.println("The given character is a Consonant");
        }
    }
}
