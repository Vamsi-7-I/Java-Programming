package strings;

public class Comparators {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        // System.out.println(a == b);
        // a == b is a comparator
        // gives true if it values are same and points to same object
        // gives false even if values are same and not pointing to same object

        // new keyword to create a string with same name expliicitly outside the string pool
        String c = new String("Kunal");
        String d = new String("Kunal");
        // System.out.println(c == d);
        // always use strings equals to method for comparison
        // it will check only value not care about how the object is pointed
        System.out.println(c.equals(d));
    }
}
