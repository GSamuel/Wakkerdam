package card;

public enum CardChooser
{
	HUMAN, WEREWOLF, CLAIRVOYANT, WITCH, SLUT, HUNTER, CUPID, HEALER;

	public Card get()
	{
		return new Human();
	}
}
