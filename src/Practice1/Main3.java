package Practice1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> foo = new ArrayList<>();
        ArrayList<Integer> bar = new ArrayList<>();
        foo.add(10);
        foo.add(20);
        foo.add(30); // ArrayListからLinkedListへの変換

        LinkedList<Integer> ll = new LinkedList<>(foo);
        LinkedList<Integer> oo = new LinkedList<>(bar);
        for(Integer i : ll) { System.out.println(i); }
        for(Integer i : oo) { System.out.println(i); }
    }
}