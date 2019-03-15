import java.util.ArrayList;


public class Drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dealer dealer = new Dealer();
		 
		 Deck deck1 = new Deck();
		 ArrayList<Card> hand = dealer.getHand(10);
		 
		 for(Card cur: hand)
		 {
			 System.out.println(cur.toString());
		 }
		 
	}
}
