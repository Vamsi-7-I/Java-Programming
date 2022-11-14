import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5];
        // arr[0] = 25;arr[1] = 30;arr[2] = 40;arr[3] = 5;arr[4] = 13;

        // inputs using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // System.out.println(Arrays.toString(arr));

        // print array elements using for each loop
//        for(int num: arr){
//            //System.out.print(num + " ");
//        }

        // System.out.println(arr[5]); // index out of bounds error

        //  array of objects
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = scn.next();
//        }
        //System.out.println(Arrays.toString(str));

        // modify
        // str[1] = "Vamsi";
        //System.out.println(Arrays.toString(str));

        modifyArr(arr,arr[1]);
    }

    public static void modifyArr(int[] arr,int ele) {
        ele = 20;
        System.out.println(Arrays.toString(arr));
        arr[2] = 20;
        System.out.println(Arrays.toString(arr));
    }


}
