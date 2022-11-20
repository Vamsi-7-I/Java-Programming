package CyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] res = new int[2];
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int index = 0;index < nums.length;index++){
            if(nums[index] != index + 1){
                res[0] = nums[index];
                res[1] = index + 1;
                break;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
