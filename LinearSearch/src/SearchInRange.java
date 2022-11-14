public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 4;
        System.out.println(search(arr,1,5,target));
    }

    public static int search(int[] arr,int start,int end,int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
