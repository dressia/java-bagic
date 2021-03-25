package Practice;

import java.util.ArrayList;
import java.util.List;

public class CardCaptor extends Clamp {



    CardCaptor() {
    }


    @Override
    public void title() {
        System.out.println("-------------------カードキャプターさくら--------------------");
    }

    @Override
    public void character() {
        List cardChar = new ArrayList();
        cardChar.add("木之本 さくら");
        cardChar.add("大道寺　知世");
        cardChar.add("ケロちゃん");
        cardChar.add("木之本　桃矢");
        cardChar.add("月城　雪兎");

        System.out.println("<登場人物>");
        cardChar.forEach(a -> System.out.println(a));
    }

    @Override
    public void story() {
        System.out.println("<あらすじ>");
        System.out.println("カードキャプターになったさくらがクローカードを集める話");

    }
}