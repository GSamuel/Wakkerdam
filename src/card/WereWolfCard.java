package card;

import ability.WereWolfAbility;

public class WereWolfCard extends Card
{
	public WereWolfCard()
	{
		this.ability = new WereWolfAbility();
		this.cardName = CardChooser.WEREWOLF;
	}
}
