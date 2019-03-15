import java.util.ArrayList;

public class Dealer {
	public Deck myDeck;
	
	public Dealer()
	{
		myDeck = new CheaterMegaDeck();
		//System.out.println(myDeck.toString());
		myDeck.shuffle();
	}
	
	public ArrayList<Card> getHand(int numCards)
	{
		ArrayList<Card> hand = new ArrayList<Card>();
		
		if(numCards < 0 || numCards > myDeck.size())
		{
			for(int count = 0; count < numCards; count++)
			{
				hand.add(myDeck.drawTopCard());
			}
		}
		return hand;
	}
}
