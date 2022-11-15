public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-12,-8,0,2,7,9,11,17,23,37,45,53,69};
        int target = 35;
        int res = binarySearch(arr,target);
        System.out.println(res);
    }
    // return the index
    // return -1 if it does not exit
    // Binary Search vs Linear Search
    // Linear Search - best case O(1) worst case O(N)
    // Binary Search - best case O(1) worst case O(log N)
    static int binarySearch(int[] arr,int target){
        // find the middle element
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            // int mid = (start + end) / 2; // (start + mid) might exceed the integer range
            int mid = start + (end - start) / 2;
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
        return -1;
    }
}
