package conditions;

public class Operators {
    public static void main(String[] args) {
        int a = 10,b = 20;
        // and - &&
        if(a == 10 && b == 20){
            System.out.println(true);
        }
        // or - ||
        if(a > b || b > a){
            System.out.println(true);
        }
        // Not - !
        if(a != b){
            System.out.println(true);
        }
    }
}
