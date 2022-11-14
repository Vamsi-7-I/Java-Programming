public class Main {
    public static void main(String[] args) {
        // store rno
        int rno = 23;

        // store student name
        String studentName = "Vamsi";

        // store 5 rno's
        int rno1 = 23;
        int rno2 = 41;
        int rno3 = 12;
        int rno4 = 3;
        int rno5 = 37;

        // arrays - collection of datatypes
        //syntax -> datatype[] variable name = new datatype[size]
        //int[] rnos = new int[5];
        //or
        //int[] rnos = {23,41,12,37,7};

        int[] rnos; // --> reference variable is stored in stack at compilation --> declaration
        rnos = new int[5]; // --> memory is allocated in heap at runtime (dynamic allocation) --> initialisation
        System.out.println(rnos[0]); // 0

        String[] arr = new String[5];
        System.out.println(arr[0]); // null
    }
}
