package character;

import card.Card;
import card.CardChooser;

public class Person
{
	private PersonalData personalData;
	private Card card;

	public Person(PersonalData personalData)
	{
		this.personalData = personalData;
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
	
	public String toString()
	{
		return personalData.toString();
	}
	
}
