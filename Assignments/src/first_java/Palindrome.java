package first_java;

import java.util.Scanner;

public class Palindrome {
    // To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
