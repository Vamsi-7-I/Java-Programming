package Conditional_loops.Intermediate;

public class Distance {
    // Calculate Distance Between Two Points
    public static void main(String[] args) {
        int x1 = 3,x2 = 3,y1 = 7,y2 = -5;
        double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println(distance);
    }
}
