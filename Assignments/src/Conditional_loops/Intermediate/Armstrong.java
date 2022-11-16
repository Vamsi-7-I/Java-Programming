package Conditional_loops.Intermediate;

public class Armstrong {
    // Conditional_loops.Intermediate.Armstrong Number In Java
    public static void main(String[] args) {
        int num = 8208;
        int digits = (int)Math.log10(num) + 1;
        int original = num;
        int res = 0;
        while(num > 0){
            int rem = num % 10;
            res += Math.pow(rem,digits);
            num = num / 10;
        }
        System.out.println(res == original);
    }
}
