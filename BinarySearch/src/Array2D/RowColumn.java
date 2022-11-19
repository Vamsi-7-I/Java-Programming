package Array2D;

public class RowColumn {
    // 2d matrix sorted row wise and column wise
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 29;
        int r = 0,c = arr[0].length - 1;
        while(r < arr.length && c >= 0){
            if(arr[r][c] == target){
                System.out.println(r + " " + c);
                return;
            }
            else if(arr[r][c] > target){
                c--;
            }
            else{
                r++;
            }
        }
        System.out.println(-1 + " " + -1);
    }
}
