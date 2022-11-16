package Conditional_loops.Intermediate;

public class Palindrome {
    // Find if a number is palindrome or not
    public static void main(String[] args) {
        int n = 121;
        int res = 0;
        int temp = n;
        while(temp > 0){
            int rem = temp % 10;
            res = res * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(res == n);
    }
}
