package intro;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // implicit conversion - 2 conditions -> both data-types should be compatible, destination datatype(left) must
        // be greater than source datatype

        // float num1 = scn.nextFloat();
        // System.out.println(num1);

        // explicit conversion / narrow conversion
        int num2 = (int)(24.57f);
        //System.out.println(num2);

        // Automatic Type Conversion
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        //System.out.println(b);

        byte a1 = 40;
        byte a2 = 50;
        byte a3 = 100;
        int a123 = (a1 * a2) / a3;
        //System.out.println(a123);

        //byte b1 = 40;
        //b1 =  b1 * 2;
        //System.out.println(b1);

        byte by = 20;
        short sh = 1024;
        char ch = 'A';
        int i = 10000;
        float fl = 4.83f;
        double d = 1.23456;
        double res = (by * fl) + (i / ch) - (d - sh);
        // (float) + (int) - (double) = double
        System.out.println((by * fl) + " " + (i / ch) + " " + (d - sh));
        System.out.println(res);
    }
}
