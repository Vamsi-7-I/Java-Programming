package first_java;

import java.util.Scanner;

public class Greeting {
    // Take name as input and print a greeting message for that particular name.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        System.out.println("Good Morning " + name);
    }
}
