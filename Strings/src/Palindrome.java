public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        for (int i = 0; i < str.length() / 2; i++) {
            char st = str.charAt(i);
            char end = str.charAt(str.length() - i - 1);
            if(st != end){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
