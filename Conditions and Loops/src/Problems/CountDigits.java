package Problems;

public class CountDigits {
    public static void main(String[] args) {
        int n = 2535534;
        int rem = 0;
        int count = 0;
        while(n > 0){
            rem = n % 10;
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
