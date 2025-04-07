import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
