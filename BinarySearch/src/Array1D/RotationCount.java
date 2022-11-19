package Array1D;
// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCount {
    // Find the Rotation Count in Rotated Sorted array
    public static void main(String[] args) {
        int arr[] = {3,4,1,2};
        int k = rotationCount(arr);
        if(k == arr.length){
            System.out.println(0);
            return;
        }
        else{
            System.out.println(k + 1);
        }
    }

    // finding pivot in the array and automatically the min value will be the next element
    // we can find the min value index it is k
    static int rotationCount(int[] arr){
        int st = 0,end = arr.length - 1;
        while(st < end){
            int mid = st + (end - st) / 2;
            if(mid + 1 < arr.length && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid - 1 >= 0 && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            else if(arr[st] >= arr[mid]){
                end  = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return -1;
    }
}
