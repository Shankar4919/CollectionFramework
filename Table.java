import java.util.ArrayList;
import java.util.List;

public class Table<T> {
    public static void main(String[] args) {
        Table<String> stringBox = new Table<>();
        stringBox.addItem("Hello");
        stringBox.addItem("World");

        stringBox.printAll();

        Table<Integer> intBox = new Table<>();
        intBox.addItem(10);
        intBox.addItem(20);
        intBox.printAll();
    }

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        return items.get(index);
    }

    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
