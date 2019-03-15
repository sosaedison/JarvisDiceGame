import java.util.ArrayList;
import java.util.Random;

/**
 * Set of Cards
 * Number of Cards
 * Order of Cards
 * Producing a string of cards
 * Shuffle the cards
 * Cut the cards
 * Remove top cards
 * Put card at the bottom
 * */
public class Deck 
{
	
	protected ArrayList<Card> cards;
	final static private int SHUFFLE_NUMBER = 1000;
	
	public Deck()
	{
		
		//System.out.println("I am deck");
		cards = new ArrayList<Card>();
		
		for(int faceVal = 0; faceVal <= 13; faceVal++)
		{
			cards.add(new Card(faceVal, 's'));
			cards.add(new Card(faceVal, 'd'));
			cards.add(new Card(faceVal, 'h'));
			cards.add(new Card(faceVal, 'c'));
		}
	}
	
	public Card drawTopCard()
	{	
		if(cards.isEmpty())
		{
		return null;
		}
		return cards.remove(0);
	}
	
	public void addCardBot(Card toAdd)
	{
		cards.add(toAdd);
	}
	private boolean hasCard(Card check)
	{
		for(int index = 0; index <= cards.size(); index++)
		{
			Card cur = cards.get(index);
			
			if(cur.getFaceValue() == check.getFaceValue() && cur.getSuit() == check.getSuit())
			{
				return true;
			}
		}
		return false;
	}

	public void shuffle ()
	{
		Random ran = new Random();
		
		for(int index = 0; index < SHUFFLE_NUMBER; index++)
		{
			Card top = cards.remove(0);
			int rIndex = ran.nextInt(cards.size());
			
			cards.add(rIndex, top);
		}
	}
	
	public String toString()
	{
		String ret = "";
		
		for(int index = 0; index < cards.size(); index++)
		{
			Card temp = cards.get(index);
			ret = ret + temp.toString();
			
			if(index != cards.size()-1)
			{
				ret = ret + " ";
			}
		}	
	return ret;
	}
	public int howMany(int faceValue)
	{
		int counter = 0;
		Card cur;
		
		for(int index = 0; index < cards.size(); index++)
		{
			cur = cards.get(index);
			if(cur.getFaceValue() == faceValue)
			{
				counter++;
			}
		}
		return counter;
	}
	
	public int size()
	{
		return cards.size();
	}
}
