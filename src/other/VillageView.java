package other;

import character.People;
import character.Person;

public class VillageView
{
	People people;
	public VillageView(Village village)
	{
		people = village.getPeople();
		
		for(Person p: people.getPeople())
			createFrame(p);

	}
	
	private void createFrame(Person p)
	{
		new SimpelPersonFrame(p).setVisible(true);
		
	}
	
}
