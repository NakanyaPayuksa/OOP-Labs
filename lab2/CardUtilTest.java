package lab2;

public class CardUtilTest {
    public static void main(String[] args) {

        Card myCard1 = new Card(Rank.ACE, Suite.SPADES);
        Card myCard2 = new Card(Rank.TEN, Suite.HEARTS);


        boolean result1 = CardUtil.isHighestCard(myCard1);
        boolean result2 = CardUtil.isHighestCard(myCard2);


        System.out.println("is myCard1 highest? : " + result1);
        System.out.println("is myCard2 highest? : " + result2);
    }
}