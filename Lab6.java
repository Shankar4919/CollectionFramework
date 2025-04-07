import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lab6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 15, 20, 25));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() > 20) {
                it.remove();
            }
        }

        System.out.println("Filtered List: " + list);
    }
}
