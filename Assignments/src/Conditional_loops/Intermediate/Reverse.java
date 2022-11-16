package Conditional_loops.Intermediate;

public class Reverse {
    // Reverse A String In Java
    public static void main(String[] args) {
        String str = "geekster";
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            newStr += ch;
        }
        System.out.println(newStr);
    }
}
