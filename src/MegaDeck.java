
public class MegaDeck extends Deck {

	public MegaDeck(int numDeck)
	{
		for(int i = 1; i< numDeck; i++)
		{
			for(int faceVal = 0; faceVal <= 13; faceVal++)
			{
				cards.add(new Card(faceVal, 's'));
				cards.add(new Card(faceVal, 'd'));
				cards.add(new Card(faceVal, 'h'));
				cards.add(new Card(faceVal, 'c'));
			}
		}
	}
	
	
	public String toString()
	{
		return "Mega Deck: " + super.toString();
	}

}
