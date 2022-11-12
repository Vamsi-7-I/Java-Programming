package conditions;

public class Main {
    public static void main(String[] args) {
        /*
                syntax:
                if(condition -> T/F){
                    statement 1
                }
                else{
                    statement2
                }
        */

        int salary = 25400;
        if(salary > 10000){
            salary = salary + 2000;
        }
        else{
            salary = salary + 3000;
        }
        System.out.println(salary);

        // multiple if else

        int marks = 55;
        if(marks > 90){
            System.out.println("Grade - A");
        }
        else if(marks > 80){
            System.out.println("Grade - B");
        }
        else if(marks > 70){
            System.out.println("Grade - C");
        }
        else if(marks > 55){
            System.out.println("Grade - D");
        }
        else{
            System.out.println("Grade - F");
        }
    }
}
