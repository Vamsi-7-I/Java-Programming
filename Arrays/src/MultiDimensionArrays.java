import java.util.*;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        /*
           1 2 3
           4 5 6
           7 8 9
        */
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] arr2D = {
                {1,2,3}, // 0th index
                {4,5},   // 1st index
                {6,7,8,9} // 2nd index
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scn.nextInt();
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
