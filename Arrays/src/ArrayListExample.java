import java.util.*;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(12);
        list.add(20);
        list.add(27);
        list.add(7);
        list.add(42);
        list.add(31);

        System.out.println(list);

        System.out.println(list.get(3));

        list.remove(3);

        System.out.println(list);
    }
}