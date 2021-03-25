package Practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Clamp> clampList = new ArrayList<>();
        clampList.add(new CardCaptor());
        clampList.add(new MagicKnight());



        new Writer(clampList).ins();
    }
}
