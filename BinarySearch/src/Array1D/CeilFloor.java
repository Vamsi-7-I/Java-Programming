package Array1D;

public class CeilFloor {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,9,11,14,17,19,21};
        int target = 1;
        int ceilValue = ceil(arr,target);
        int floorValue = floor(arr,target);
        System.out.println(ceilValue);
        System.out.println(floorValue);
    }

    public static int ceil(int[] arr,int target){
        // ceil : smallest of the greater than target
        int start = 0,end = arr.length - 1;
        while(start <= end){
            int mid = (start) + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }

    public static int floor(int[] arr,int target){
        // floor : greatest of the smaller than target
        int start = 0,end = arr.length - 1;
        while(start <= end){
            int mid = (start) + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return end;
    }
}
