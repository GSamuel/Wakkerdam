package other;
import java.util.Vector;

import character.Person;


public class DayNightCycle
{
		private boolean isDay;
		private int cycle;
		private Village village;
		
		public DayNightCycle(Village village)
		{
			this.village = village;
			isDay = false;
			cycle = 1;
		}
		
		public void execute()
		{
			Vector<Person> people = new Vector<Person>();
			for(Person p : village.getPeople())
				people.add(p);
			
			while(!people.isEmpty())
			{
				people.get(0).execute(village);
			}
			
			if(isDay)
				cycle++;
			isDay = !isDay;
		}
		
		public int getCycle()
		{
			return cycle;
		}
		
		public boolean isDay()
		{
			return isDay;
		}
}
