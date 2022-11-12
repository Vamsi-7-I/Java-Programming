package intro;

public class Basics {
    public static void main(String[] args) {
        // if condition
        if(true){
            System.out.println("Hello World!");
        }

        // if else
        int num = 10;
        if(num < 10){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        // while loop
        int count = 1;
        while(count != 5){
            System.out.print(count + " ");
            count++;
        }

        // for loop
        for(int i = 1;i != 5;i++){
            System.out.print(i + " ");
        }
    }
}
