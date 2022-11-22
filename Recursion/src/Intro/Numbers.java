package Intro;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(1);
        number2(2);
    }

    static void number2(int n){
        System.out.println(n);
        number3(3);
    }

    static void number3(int n){
        System.out.println(3);
        number4(4);
    }

    static void number4(int n){
        System.out.println(n);
        number5(5);
    }

    static void number5(int n){
        System.out.println(n);
    }
}
