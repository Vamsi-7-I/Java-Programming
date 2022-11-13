package functions;

public class Scope {
    public static void main(String[] args) {
        int num1 = 10;
        change(num1);
        //System.out.println(a);
        {
            // block scope
            //int num1 = 10; cannot initialize the variable if it is already defined
            num1 = 20; // can be updated
            System.out.println(num1);
            int num2 = 50; // accessed within this block scope
        }
        //System.out.println(num2); // cannot accessed outside the block
    }

    // function scope
    static void change(int a) {
        a = 20; // it can be accessed to this function scope only not outside
        // loop scope
        for (int i = 0; i < 4 ; i++) {
            int num1 = 10;
            int num2 = 50; // can be accessed within the scope
        }
        //System.out.println(i); // cannot be used outside the block
    }
}
