package switch_cases;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        String fruit = scn.next();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruit");
//            case "apple" -> System.out.println("A sweet red fruit");
//            case "orange" -> System.out.println("A round fruit");
//            case "grapes" -> System.out.println("A small fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }
        int day = scn.nextInt();
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }


    }
}
