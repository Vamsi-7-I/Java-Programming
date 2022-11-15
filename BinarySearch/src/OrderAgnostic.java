public class OrderAgnostic {
    // Order Agnostic Binary Search Algorithm
    public static void main(String[] args) {
        // int arr[] = {-12,-8,0,2,7,9,11,17,23,37,45,53,69};
        int arr[] = {69,53,45,37,23,17,11,9,7,2,0,-8,-12};
        int target = 37;
        int res = orderAgnostic(arr,target);
        System.out.println(res);
    }

    public static int orderAgnostic(int[] arr,int target){
        // find the middle element
        int start = 0;
        int end = arr.length - 1;
        // check if ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            // int mid = (start + end) / 2; // (start + mid) might exceed the integer range
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(arr[mid] > target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
