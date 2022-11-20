package CyclicSort;

import java.util.Arrays;

public class Main {
    // cyclic sort
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != correct){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            if(arr[i] - 1 == i){
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
