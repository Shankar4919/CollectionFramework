import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));
        List<Integer> subList = list.subList(1, 4); // index 1 to 3

        System.out.println("SubList: " + subList);
        subList.set(0, 99);  // This affects original list
        System.out.println("Original after change: " + list);
    }


/*    List Methods Recap
    Covered methods:
    add, addAll
            remove, removeAll, retainAll
    contains, containsAll
            clear, isEmpty
    size, get, set
            indexOf, lastIndexOf
    sort, reverse
            iterator, listIterator*/
}
