import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        maxElement(arr,0,arr.length - 1);
        maxInRange(arr,2,arr.length - 2);
        reverse(arr,0,arr.length - 1);
    }
    public static void maxElement(int[] arr,int start,int end){
        int max = Integer.MIN_VALUE;
        for(int i = start;i <= end;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void maxInRange(int[] arr,int start,int end){
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
