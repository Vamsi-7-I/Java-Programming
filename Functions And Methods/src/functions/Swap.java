package functions;

public class Swap {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        swap(num1,num2);
        System.out.println(num1 + " " + num2);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = a;
    }
}
