package Conditional_loops.Intermediate;

public class Sum {
    // Sum Of A Digits Of Number
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
