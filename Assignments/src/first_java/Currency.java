package first_java;

import java.util.Scanner;

public class Currency {
    // Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rupees = scn.nextInt();
        double dollars = rupees * 0.012;
        System.out.println(dollars + "USD");
    }
}
