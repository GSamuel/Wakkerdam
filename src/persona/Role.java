package persona;

public enum Role
{
	HUMAN, WEREWOLF, WITCH;

	public String toString()
	{
		switch (this)
		{
		case HUMAN:
			return "Human";
		case WEREWOLF:
			return "Werewolf";
		case WITCH:
			return "Witch";
		}
		return this.toString();

	}
}
