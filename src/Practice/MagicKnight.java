package Practice;

import java.util.ArrayList;
import java.util.List;

public class MagicKnight extends Clamp {
    @Override
    public void title() {
        System.out.println("-------------------マジックナイトレイアース--------------------");
    }

    @Override
    public void character() {
        List magicChar = new ArrayList();
        magicChar.add("獅堂 光");
        magicChar.add("龍咲 海");
        magicChar.add("鳳凰寺 風");
        magicChar.add("モコナ");
        magicChar.add("エメロード");

        System.out.println("<登場人物>");
        magicChar.forEach(b -> System.out.println(b));
    }

    @Override
    public void story() {
        System.out.println("<あらすじ>");
        System.out.println("３人のマジックナイトがセフィーロに呼ばれ、あんなことやこんなことをする話");
    }

    @Override
    public void working() {
        super.working();
    }
}
