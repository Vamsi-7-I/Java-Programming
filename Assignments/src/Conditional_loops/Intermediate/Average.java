package Conditional_loops.Intermediate;

public class Average {
    // Average of n numbers
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        int avg = sum / n;
        System.out.println(avg);
    }
}
