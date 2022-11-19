package Array1D;

public class Infinite {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int ans = findingRange(arr,target);
        System.out.println(ans);
    }

    public static int findingRange(int arr[],int target){
        // start with size of box 2
        int start = 0,end = 1;

        // condition for target to lie in the range
        while(target > arr[end]){
             int temp = end + 1;
            // double the box value
            // end = prevEnd + (size * 2)
             end = end + (end - start + 1) * 2;
             start = temp;
        }
        int ans = binarySearch(arr,target,start,end);
        return ans;
    }
    public static int binarySearch(int[] arr,int target,int st,int end){
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return -1;
    }
}
