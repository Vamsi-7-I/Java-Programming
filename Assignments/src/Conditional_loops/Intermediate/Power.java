package Conditional_loops.Intermediate;

public class Power {
    public static void main(String[] args) {
        int base = 5;
        int exponent = 3;
        int power = 1;
        while(exponent != 0){
            power = power * base;
            exponent--;
        }
        System.out.println(power);
    }
}
