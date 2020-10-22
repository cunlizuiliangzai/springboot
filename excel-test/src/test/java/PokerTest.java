/**
 * @author ex_111806190
 * @since 2020-10-13 14:46
 */
public class PokerTest {
    public static void main(String[] args) {
        Poker poker = new Poker();
        // 洗牌
        poker.shuffle();
        // 发第一张牌
        Poker.Card c1 = poker.deal(0);

        // 对于非静态内部类Card
        // 只有通过其外部类Poker 对象才能创建Card 对象
        // 自己创建一张牌
        Poker.Card c2 = poker.new Card("红心", 1);
        // 洗牌后的第一张
        System.out.println(c1);
        // 打印: 红心A
        System.out.println(c2);

    }
}
