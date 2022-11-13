package functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // variable arguments
        // when we don't know how many variables we are passing we use varArgs
        fun(1,2,3,4,5,6);
        multiple(1,2,3,4,5,6);
    }

    static void multiple(int a,int b,int ...v) {
        // varargs should come at the end
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
