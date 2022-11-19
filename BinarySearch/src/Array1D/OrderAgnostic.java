package Array1D;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {-3,-1,5,17,25,29,35,43,47,52,59,66,74};
        int target = 29;
        int ans = orderAgnostic(arr,target);
        System.out.println(ans);
    }

    public static int orderAgnostic(int[] arr,int target){
        int st = 0,end = arr.length - 1;
        boolean isAsc = arr[st] < arr[end];
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    st = mid + 1;
                }
            }
            else{
                if(target < arr[mid]){
                    st = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
