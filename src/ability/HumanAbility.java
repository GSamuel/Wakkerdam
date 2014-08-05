package ability;

import other.Village;

public class HumanAbility extends Ability
{

	@Override
	public void nightStarted()
	{
		System.out.println("zzzZzzZZzZZZ");
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
