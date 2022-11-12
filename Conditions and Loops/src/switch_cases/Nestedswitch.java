package switch_cases;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int emp_ID = scn.nextInt();
        String department = scn.next();

        switch(emp_ID){
            case 1 -> System.out.println("Kunal Kushwawa");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Ronit Singh");
                switch (department){
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department Entered");
                }
            }
            default -> System.out.println("Please enter a valid emp_ID");
        }
    }
}
