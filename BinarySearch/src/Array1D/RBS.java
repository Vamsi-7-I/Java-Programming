package Array1D;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int pivotBS(int arr[],int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            // just do normal BS
            return binarySearch(arr,target,0,arr.length - 1);
        }

        // pivot is found, we have found 2 asc sorted arrays
        if(arr[pivot] == target){
            return pivot;
        }
        else if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot - 1);
        }
        return binarySearch(arr,target,pivot + 1,arr.length - 1);
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

    // find the pivot index in the array
    static int findPivot(int[] arr){
        int st = 0,end = arr.length - 1;
        while(st < end){
            int mid = st + (end - st) / 2;
            // 4 cases
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(mid > st && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            else if(arr[st] > arr[mid]){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return -1;
    }
}
