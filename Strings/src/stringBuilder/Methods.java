package stringBuilder;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Vamsi Iswarabhottla";
        char[] ch = name.toCharArray();
        System.out.println(ch);
        System.out.println(name.toLowerCase());
        System.out.println("   vamsi    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
