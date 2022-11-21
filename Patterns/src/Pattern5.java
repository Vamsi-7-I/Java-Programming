public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        // approach 1
//        for (int row = 1; row <= n; row++) {
//            for (int col1 = 1; col1 <= row; col1++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int row = 1; row < n; row++) {
//            for (int col2 = row; col2 < n; col2++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int row = 0; row < 2 * n; row++) {
            int c = (row > n)? n - (row - n - 1) : row;
            for (int col = 0; col < c; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
