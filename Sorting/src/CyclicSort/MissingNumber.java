package CyclicSort;
// https://leetcode.com/problems/missing-number/
// Amazon question
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }

        // find the missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        // case 2 : if N is not present in the array
        return arr.length;
    }
}
