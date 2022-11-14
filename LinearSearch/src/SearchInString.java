import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Vamsi";
        char target = 's';
        boolean ans = search(str,target);
        System.out.println(ans);
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search2(String str,char target){
        for(char ch: str.toCharArray()){
            return true;
        }
        return false;
    }

    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
