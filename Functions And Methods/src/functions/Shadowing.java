package functions;

// shadowing -> practice of using variables in overlapping scopes with same name, where low-level scopes
//              overrides the high-level scopes
public class Shadowing {
    static int x = 20;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        //System.out.println(x); // scope will begin when value is initialised
        x = 100;
        System.out.println(x);
        fun();
    }
    public static void fun(){
        System.out.println(x);
    }
}
