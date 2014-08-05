package ability;

import other.Village;

public class WereWolfAbility extends Ability
{
	@Override
	public void nightStarted()
	{
		System.out.println("Howling!!!!");
	}

	@Override
	public boolean execute(Village village)
	{
		if (village.isDay())
		{
			System.out.println("Let's vote");
			return true;
		} else
		{
			nightStarted();
			return true;
		}
	}

}
