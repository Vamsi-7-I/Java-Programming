package insertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // sorting the elements partially
        // sorting the elements part by part
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for(int i = 0;i <= arr.length - 2;i++){
            // i --> no of passes
            // if j < j - 1 break the array
            for(int j = i + 1;j > 0;j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
