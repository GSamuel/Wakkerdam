package character;

import card.Card;
import card.CardChooser;

public class PersonalGameData
{
	private Card card;
	
	public PersonalGameData()
	{
		this.card = CardChooser.HUMAN.get(); //Sets card standard on Human
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
