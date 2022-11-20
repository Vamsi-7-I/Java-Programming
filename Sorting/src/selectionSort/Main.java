package selectionSort;

import java.util.Arrays;

public class Main {
    // selection sort
    // select an element and put it in its original position
    public static void main(String[] args) {
        int arr[] = {3,1,5,4,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i = 0;i < arr.length;i++){
            // find the maximum element in the array
            // swap with its current position
            int last =  arr.length - i - 1;
            int maxIndex = maxIndex(arr,0,last);
            // swap the maxIndex with the lastIndex
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    static int maxIndex(int[] arr,int first,int last){
        int max = first;
        for(int i = 0;i <= last;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
