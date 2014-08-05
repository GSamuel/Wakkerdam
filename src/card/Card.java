package card;

import ability.Ability;

public abstract class Card
{
	protected Ability ability;
	protected CardChooser cardName;

	public Ability getAbility()
	{
		return ability;
	}
	
	public CardChooser getCardName()
	{
		return cardName;
	}
	
}
