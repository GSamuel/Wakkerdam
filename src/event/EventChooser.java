package event;

public enum EventChooser
{
	WEREWOLF_NIGHT;

	public GameEvent get()
	{
		switch (this)
		{
		case WEREWOLF_NIGHT:
			return new WereWolfNight();
		default:
			return new WereWolfNight();
		}
	}
}
