package event;

import ability.Ability;

public interface GameEvent
{
	public void execute(Ability ability);
}
