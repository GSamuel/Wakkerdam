import java.util.Random;
import java.util.Vector;

import other.Village;
import other.VillageView;
import character.Age;
import character.Gender;
import character.Person;
import character.PersonalData;

public class Wakkerdam
{
	public static void main(String[] args)
	{		
		Random rand = new Random();

		Vector<PersonalData> persons = new Vector<PersonalData>();
		persons.add(new PersonalData("Piet", Gender.MALE, Age.ADULT));
		persons.add(new PersonalData("Henk", Gender.MALE, Age.OLD));
		persons.add(new PersonalData("Sem", Gender.MALE, Age.YOUNG));
		persons.add(new PersonalData("Robin", Gender.MALE, Age.OLD));
		persons.add(new PersonalData("Elmo", Gender.MALE, Age.OLD));
		persons.add(new PersonalData("Carla", Gender.WOMAN, Age.OLD));
		persons.add(new PersonalData("Anke", Gender.WOMAN, Age.OLD));
		persons.add(new PersonalData("Mimi", Gender.WOMAN, Age.YOUNG));
		persons.add(new PersonalData("Barmmie", Gender.WOMAN, Age.YOUNG));

		Village village = new Village(10);

		for (int i = 0; i < village.getSize(); i++)
		{
			village.addPerson(new Person(persons.get(rand.nextInt(persons.size()))));
		}
		
		village.prepareGame();
		//village.execute();
		
		new VillageView(village).setVisible(true);
		
		
		
		while(true)
		{
			village.update();
			
			
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}

}
