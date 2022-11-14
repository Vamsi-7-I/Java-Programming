public class Main {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = -3;
        int ans = linearSearch(nums,target);
        boolean ans2 = linearSearch2(nums,target);
        System.out.println(ans);
        System.out.println(ans2);
    }

    // search in the array : return the index if found
    // otherwise if item is not found return -1

    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // check for every element if target is found
            if(arr[index] == target){
                return index;
            }
        }
        // if target is not found
        return -1;
    }

    // search target return true or false
    static boolean linearSearch2(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            // check for every element if target is found
            if(arr[index] == target){
                return true;
            }
        }
        // if target is not found
        return false;
    }
}
