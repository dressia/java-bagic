package Practice1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("List 생성");

        ArrayList dkdkdskdkd = new ArrayList();
        dkdkdskdkd.add("일");
        dkdkdskdkd.add("월");
        dkdkdskdkd.add("수");

        Iterator iter = dkdkdskdkd.iterator();

        while (iter.hasNext()) {
            String day = (String) iter.next();
            if (day == "수") {
                iter.remove();
            }

            System.out.println("Day : " + day);
        }

        System.out.println("-------------------");

        iter = dkdkdskdkd.iterator();

        while (iter.hasNext()) {
            String day = (String) iter.next();
            System.out.println("Day : " + day);
        }
    }
}
