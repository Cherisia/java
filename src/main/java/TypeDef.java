import java.util.ArrayList;
import java.util.Collections;

class Hello {
    public ArrayList<Integer> reverseListOfNumbers(ArrayList<Integer> list) {
        Collections.reverse(list);
        return list;
    }
}

public class TypeDef {
    public static void main(String[] args) {
        Hello hello = new Hello();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(hello.reverseListOfNumbers(list));

    }
}
