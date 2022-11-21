public class Pattern28 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2 * n; row++) {
            int c = (row > n) ? n - (row - n) : row;
            int spaces = n - c;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
