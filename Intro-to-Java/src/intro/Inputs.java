package intro;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int rollNo = input.nextInt();
        System.out.println(rollNo);

        System.out.print("Enter True/False: ");
        boolean hasOwnCar = input.nextBoolean();
        System.out.println(hasOwnCar);

        System.out.print("Enter a String: ");
        String fname = input.next();
        System.out.println(fname);
    }
}
