package Conditional_loops.Intermediate;

public class Discount {
    // Calculate Discount Of Product
    public static void main(String[] args) {
        int cost = 50;
        int discount = 10;
        int discountAmount = (cost * discount) / 100;
        int totalCost = cost - discountAmount;
        System.out.println(totalCost);
    }
}
