package Problems;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int res = 0;
        // Take input till user enter X
        while(true){
            // take character input
            System.out.println("Enter the Operator: ");
            char ch = scn.next().trim().charAt(0);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.println("Enter the two numbers: ");
                int num1 = scn.nextInt();
                int num2 = scn.nextInt();
                if(ch == '+'){
                    res = num1 + num2;
                }
                else if(ch == '-'){
                    res = num1 - num2;
                }
                else if(ch == '*'){
                    res = num1 * num2;
                }
                else if(ch == '/'){
                    if(num2 != 0){
                        res = num1 - num2;
                    }
                }
                else{
                    res = num1 % num2;
                }
                System.out.println(res);
            }
            else if(ch == 'x' || ch == 'X'){
                break;
            }
            else{
                System.out.println("Not a Character");
            }
        }
    }
}
