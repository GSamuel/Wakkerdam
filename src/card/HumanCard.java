package card;

import ability.HumanAbility;

public class HumanCard extends Card
{
	public HumanCard()
	{
		this.ability = new HumanAbility();
		this.cardName = CardChooser.HUMAN;
	}
}
