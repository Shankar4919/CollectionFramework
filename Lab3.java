import java.util.ArrayList;
import java.util.List;

public class Lab3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Shanker",3));
        Student student = new Student("Prakash",100);
        student.dispaly();

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + " (" + id + ")";
    }
    public void dispaly(){
        System.out.println("Good Morning!");
    }
}