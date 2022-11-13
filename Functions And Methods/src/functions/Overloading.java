package functions;

// function overloading :- two or more functions can be used when they have different argument types (or)
//                         no of arguments are different
// function call happens according to the values we passed
// it has nothing to do with return types

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(10);
        fun("Vamsi");
        fun(10,"Vamsi");
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        demo(1,2,3);
        demo("Vamsi","Rahul");
    }
    static void fun(int num){
        System.out.println(num);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int num,String name){
        System.out.println(num + " " + name);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a + b + c;
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
