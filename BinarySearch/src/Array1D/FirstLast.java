package Array1D;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstLast {
    // Given an array of integers nums sorted in non-decreasing order,
    // find the starting and ending position of a given target value.
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target = 6;
        int[] bruteForceAns = linearSearch(arr,target);
        System.out.println(Arrays.toString(bruteForceAns));
        int[] optimisedAns = binarySearch(arr,target);
        System.out.println(Arrays.toString(optimisedAns));
    }
    static int[] linearSearch(int[] nums,int target){
        int first = -1,last = -1;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target){
                first = i;
                break;
            }
        }
        for(int i = nums.length - 1;i >= 0;i--){
            if(nums[i] == target){
                last = i;
                break;
            }
        }
        if(first == -1 || last == -1){
            return new int[] {-1,-1};
        }
        return new int[] {first,last};
    }

    static int[] binarySearch(int[] nums,int target){
        int first = Position(nums,target,true);
        int last = Position(nums,target,false);
        if(first != -1 && last != -1){
            return new int[] {first,last};
        }
        return new int[] {-1,-1};
    }

    static int Position(int[] nums, int target,boolean startIndex) {
        int ans = -1;
        int st = 0,end = nums.length - 1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                st = mid + 1;
            }
            else{
                ans = mid;
                if(startIndex){
                    end = mid - 1;
                }
                else{
                    st = end + 1;
                }
            }
        }
        return ans;
    }
}
