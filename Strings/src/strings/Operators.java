package strings;
import java.util.*;

public class Operators {
    public static void main(String[] args) {
        // "+" - concatenation
        // operator overloadonf
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        // integer will converted to Integer that will call toString()
        System.out.println("Vamsi" + new ArrayList<>());
        System.out.println("Vamsi" + new Integer(42));
        System.out.println(new Integer(42) + " " + new ArrayList<>());
    }
}
