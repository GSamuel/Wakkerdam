package event;

public enum EventChooser
{
	WEREWOLF_NIGHT, DAILY_EXECUTION;

	public GameEvent get()
	{
		switch (this)
		{
		case WEREWOLF_NIGHT:
			return new WereWolfNight();
		default:
			return new DailyExecution();
		}
	}
}
