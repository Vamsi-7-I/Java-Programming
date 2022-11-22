package Intro;

public class NumbersRecursion {
    // a function calling itself
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        System.out.println(n);

        // base condition :- condition where the recursion stops new callings. when we not give
        // base condition the memory exceeds and stack is overflowed
        if(n == 5){
            return;
        }

        // recursive call :- calling same function again but it have separate memory in stack
        // tail recursion :- this is the last function call
        print(n + 1);
    }
}
