package Practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Main1 {
  public static void main(String[] args) {
     List<String> setOfString = new ArrayList<>();
              setOfString.add("A");
              setOfString.add("B");
              setOfString.add("C");
              setOfString.add("B");
              setOfString.add(null);
              setOfString.add("A");
              setOfString.add(null);

              Iterator iterator = setOfString.iterator();
              while (iterator.hasNext()) {
              if (null==iterator.next()) {
                            iterator.remove();
               }
              }
              for (String string1 : setOfString) {
                System.out.println(string1);
              }
   }
}