package strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float num = 32.12745f;
        System.out.println(num);
        System.out.printf("Formatted number is %.2f",num);
        System.out.println();
        System.out.printf("Pie: %.3f",Math.PI);
    }
}
