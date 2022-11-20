package CyclicSort;

import java.util.ArrayList;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google Question
public class DisappearedNumbers {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> list = findDisappearedNumbers(arr);
        System.out.println(list);
    }
    public static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        // finding missing elements
        for(int index = 0;index < arr.length;index++){
            if(arr[index] != index + 1){
                list.add(index + 1);
            }
        }
        return list;
    }
}
