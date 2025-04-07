import java.util.*;
public class Box<T>{
    T a;
    T b;
    public Box(T a, T b){
        this.a = a;
        this.b = b;
    }
    public void display(){
        System.out.println(a);
        System.out.println(b);
    }


}
