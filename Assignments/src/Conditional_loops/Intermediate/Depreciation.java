package Conditional_loops.Intermediate;

public class Depreciation {
    // Calculate Depreciation of Value
    public static void main(String[] args) {
        float initialValue = 200;
        float rate = 10;
        rate = rate / 100;
        float time = 2;
        float depreciation = (float)(initialValue * (Math.pow((1 - rate),time)));
        System.out.println(depreciation);
    }
}
