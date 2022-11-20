package CyclicSort;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Microsoft problem
public class Duplicate2 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        for(int index = 0;index < nums.length;index++) {
            if (nums[index] != index + 1) {
                System.out.println(nums[index]);
            }
        }
    }
}
