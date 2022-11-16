package Conditional_loops.Intermediate;

public class BattingAverage {
    // Calculate Batting Average
    public static void main(String[] args) {
        int matches = 6,runs = 296,innings = 6,notouts = 3;
        int avg = (runs)/(innings - notouts);
        System.out.println(avg);
    }

}
