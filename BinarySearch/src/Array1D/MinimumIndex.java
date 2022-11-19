package Array1D;
// https://leetcode.com/problems/find-in-mountain-array/
public class MinimumIndex {
    // minimum index of target in mountain array, if not return -1
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = searchPeak(arr);
        int firstTry = orderAgnostic(arr,0,peak,target);
        if(firstTry != -1){
            System.out.println(firstTry);
            return;
        }
        // search in second half
        int secondTry = orderAgnostic(arr,peak + 1,arr.length - 1,target);
        System.out.println(secondTry);
    }
    // first finding the peak index in the array
    static int searchPeak(int[] arr){
        int st = 0,end = arr.length - 1;
        while(st < end){
            int mid = st + (end - st) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                st = mid + 1;
            }
        }
        return st;
    }
    // using orderAgnostic binary search, we find the index by searching in asc or des array
    static int orderAgnostic(int[] arr,int st,int end,int target){
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
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
}
