package event;

import ability.Ability;

public class NightStarted implements GameEvent
{

	@Override
	public void execute(Ability ability)
	{
		ability.nightStarted();
	}
}
