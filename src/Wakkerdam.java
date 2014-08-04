import java.util.Random;
import java.util.Vector;

import character.Age;
import character.Gender;
import character.Person;


public class Wakkerdam
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		
		Vector<Person> persons = new Vector<Person>();
		persons.add(new Person("Piet", Gender.MALE ,Age.ADULT));
		persons.add(new Person("Henk", Gender.MALE ,Age.ADULT));
		persons.add(new Person("Sem", Gender.MALE ,Age.YOUNG));
		persons.add(new Person("Robin", Gender.MALE ,Age.OLD));
		persons.add(new Person("Carla", Gender.WOMAN ,Age.OLD));
		persons.add(new Person("Anke", Gender.WOMAN ,Age.OLD));
		persons.add(new Person("Mimi", Gender.WOMAN ,Age.YOUNG));
		
		Village village = new Village(20);
		
		for(int i = 0; i < village.getSize(); i++)
		{
			village.addPerson(persons.get(rand.nextInt(persons.size())));
		}
		
		

	}

}
