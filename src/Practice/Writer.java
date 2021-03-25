package Practice;

import java.util.List;

public class Writer {


    private List<Clamp> list;

    Writer() {
    }

    Writer(List list) {
        this.list = list;
    }

    public void ins() {
        list.forEach(clamp -> clamp.working());
    }

}
