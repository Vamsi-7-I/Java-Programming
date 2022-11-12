package loops;

public class Main2 {
    public static void main(String[] args) {
        // while loops
        /*
             Syntax:
             initialisation;
             while(condition){
                 // body
                 increment/decrement
             }
        */
        int num = 1;
        while(num <= 5){
            //System.out.println(num);
            num++;
        }

        // do while
        // syntax:
        //  do{
        //     body
        //     increment/decrement
        //  }while(condition)

        int n = 1;
        do{
            System.out.println("Hello World");
            n++;
        }while(n < 1);
    }
}
