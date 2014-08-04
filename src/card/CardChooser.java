package card;

public enum CardChooser
{
	HUMAN, WEREWOLF, CLAIRVOYANT, WITCH, SLUT, HUNTER, CUPID, HEALER;

	public Card get()
	{
		switch (this)
		{
		case WEREWOLF:
			return new WereWolfCard();
		default:
			return new HumanCard();
		}
	}
}
