
public class CheaterMegaDeck extends MegaDeck {

	private int drawTopCardCount = 0;
	
	public CheaterMegaDeck(int numDeck) {
		super(numDeck);
		// TODO Auto-generated constructor stub
	}

	public CheaterMegaDeck()
	{ 
		super(9);
	}

	public Card drawTopCard()
	{
		this.drawTopCardCount++;
		
		if(this.drawTopCardCount%5 == 0)
		{
			for(int index = 0; index < this.cards.size(); index++)
			{
				Card curCard=this.cards.get(index);
				
				if(curCard.getFaceValue()==1)
				{
					return this.cards.remove(index);
				}
			}
		}
		return super.drawTopCard();
	}
}