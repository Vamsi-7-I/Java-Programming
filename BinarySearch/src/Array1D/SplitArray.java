package Array1D;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
    }
    public static int splitArray(int[] arr,int k){
        int st = 0,end = 0;
        for(int i = 0;i < arr.length;i++){
            st = Math.max(arr[i],st);
            end += arr[i];
        }
        while(st < end){
            // try for middle as potential answer
            int mid = st + (end - st) / 2;
            // calculate how many pieces you can divide in this max sum
            int sum = 0;
            int pieces = 1;
            for(int num: arr){
                if(sum + num > mid){
                    // you cannot add in this sub array . make a new one
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            if(pieces > k){
                st = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return end; // start == end
    }
}
