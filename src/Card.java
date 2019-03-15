
public class Card 
{

	private char suit;
	private int faceValue;
	
	public Card(int val, char s) 
	{
		faceValue = val;
		suit = s;
	}
	
	public int getFaceValue() 
	{
		return faceValue;
	}
	public char getSuit() 
	{
		return suit;
	}
	public String toString() 
	{
		String ret = "ERROR";
		
		if(faceValue == 11) 
		{
			ret = "Jack of";
		}else if(faceValue == 12) 
		{
			ret = "Queen of ";
		}else if(faceValue == 13) 
		{
			ret = "King of ";
		}else if(faceValue == 1)
		{
			ret = "Ace of ";
		}else 
		{
			ret = faceValue + " of ";
		}
		
		if(suit == 'c') 
		{
			ret = ret + "Clubs\n";
		}else if(suit == 's') 
		{
			ret = ret + "Spades \n";
		}else if(suit == 'h') 
		{
			ret = ret + "Hearts\n";
		}else if(suit == 'd')
		{
			ret = ret + "Diamonds\n";
		}
		
		return ret;
	}
	
	public boolean equals(Card other) 
	{
		return faceValue == other.getFaceValue() && suit == other.getSuit();
	}
	
}
