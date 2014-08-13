package persona;

public enum Role
{
	HUMAN, WEREWOLF, WITCH, HEALER;

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
		case HEALER:
			return "Healer";
		default:
			return "unspecified";
		}

	}
}
