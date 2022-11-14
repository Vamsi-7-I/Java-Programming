public class EvenDigitsOptimised {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(evenDigits(arr));
    }

    public static int evenDigits(int[] arr){
        int evenCount = 0;
        for(int num: arr){
            if(even(num)){
                evenCount++;
            }
        }
        return evenCount;
    }

    public static boolean even(int num){
        if(num < 0){
            num = num * -1;
        }
        int noOfDigits = digits(num);
        return noOfDigits % 2 == 0;
    }

    public static int digits(int num){
        return (int)(Math.log10(num) + 1);
    }
}
