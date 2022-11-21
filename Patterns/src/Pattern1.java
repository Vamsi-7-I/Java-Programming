public class Pattern1 {
    public static void main(String[] args) {
        // outer loop - no of lines - no of rows
        // inner loop - no of cols in each row
        // what should be print
        int n = 4;
        for(int row = 0;row < n;row++){
            for(int col = 0;col <= row;col++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
