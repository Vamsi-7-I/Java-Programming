package functions;

public class Passingvalue {
    public static void main(String[] args) {
        String name = "Vamsi";
        greet(name);
        System.out.println(name);
        int arr[] = {1,2,3,4,5,6};
        changeArr(arr);
        System.out.println(arr);
    }
    // Java is pass by value
    // Primitive data types -> pass by value
    // objects -> pass by value by creating reference variable copy
    static void greet(String naam) {
        naam = "Rahul"; // here we are not modifying the string we are creating a new object for the
                        // variable and strings are immutable
    }
    static void changeArr(int[] nums) {
        nums[0] = 0; // here we are modifying the arr not creating
    }

}
