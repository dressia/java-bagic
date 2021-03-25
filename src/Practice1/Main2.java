package Practice1;
import java.util.ArrayList;
import java.util.List;

public class Main2 implements Cloneable {

    public static void main(String[] args) {
        ArrayList<Integer> foo = new ArrayList<Integer>();
        List<Integer> foo2 = new ArrayList<Integer>();
        foo.add(10);
        foo.add(20);
        foo.add(30);

//            Object clone = foo.clone();

            foo.clone();
            // ArrayListのコピー
            ArrayList<Integer> bar = (ArrayList<Integer>)foo.clone();

            for(Integer i : bar) {
                System.out.println(i);
            }
   }

}