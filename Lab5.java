import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab5 {
    public static void main(String[] args) {
        // Array to ArrayList
        String[] arr = {"Apple", "Banana", "Cherry"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("List: " + list);

        // ArrayList to Array
        String[] newArr = list.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(newArr));
    }
}
