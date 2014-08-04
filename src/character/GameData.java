package character;

import card.Card;
import card.CardChooser;

public class GameData
{
	private Card card;
	
	public GameData()
	{
		this.card = CardChooser.HUMAN.get();
	}
	
	public Card getCard()
	{
		return card;
	}

	public void setCard(Card card)
	{
		this.card = card;
	}
}
