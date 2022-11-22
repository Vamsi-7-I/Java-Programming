package Intro;

public class BS {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,55,66,78};
        int target = 55;
        int ans = search(arr,target,0,arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr,int target,int st,int end){
        if(st > end){
            return -1;
        }

        int mid = st + (end -st) / 2;

        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
            return search(arr,target,st,mid - 1);
        }
        return search(arr,target,mid + 1,end);

    }
}
