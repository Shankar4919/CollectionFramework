import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("Get index 1: " + fruits.get(1));

        fruits.set(1, "Mango");
        fruits.add("Orange");

        fruits.remove(3);

        System.out.println("Update Fruits: " + fruits);
        System.out.println("Update Size: " + fruits.size());

        for(String name: fruits){
            System.out.println(name);
        }

    }
}