public class EvenDigits {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        // Given an array nums of integers, return how many of them contain an even number of digits.
        int[] arr = {12,345,2,6,7896};
        // System.out.println(findNumbers(arr));
        System.out.println();
    }

    public static int findNumbers(int[] arr){
        int count = 0;
        for(int num: arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num){
        int noOfDigits = 0;
        while(num > 0){
            noOfDigits++;
            num = num / 10;
        }
        return noOfDigits % 2 == 0;
    }
}
