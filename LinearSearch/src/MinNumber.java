public class MinNumber {
    public static void main(String[] args) {
        int arr[] = {12,53,26,62,11,33,5,42};
        int min = minNumber(arr);
        int max = maxNumber(arr);
        System.out.println(min);
        System.out.println(max);
    }

    public static int minNumber(int[] arr){
        int min = Integer.MAX_VALUE;
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // assume array is not empty
    public static int maxNumber(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
