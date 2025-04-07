import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lab4 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Charlie", "Alice", "Bob","Shanker"));

        Collections.sort(names);
        System.out.println("Sorted: " + names);

        System.out.println("Contains 'Alice'? " + names.contains("Shanker"));
        System.out.println("Index of 'Bob': " + names.indexOf("Bob"));
    }
}
