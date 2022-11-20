package bubbleSort;

import java.util.Arrays;

public class Main {
    // Bubble Sort / Sinking Sort / Exchange Sort
    // we are comparing adjacent elements
    // with every pass, we are getting the largest element in array to the end
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4};
        //  j is responsible for sorting and i is no of passes
        // if j never swaps then the array is sorted program breaks
        // T.C :- W.C --> O(n ^ 2) B.C --> O(n)
        // int T.C, constants are ignored
        // S.C --> 0(1) constant 0 extra space
        // this is also called inplace sorting algorithms
        //
        for(int i = 0;i < arr.length;i++){
            boolean swap = false;
            for(int j = 1;j < arr.length - i;j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
//                    swap = true;
                }
                // if in a particular pass swap not happens break
                if(swap == false) break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
