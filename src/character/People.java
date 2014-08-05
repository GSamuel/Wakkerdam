package character;

import java.util.Vector;

public class People
{
	private Vector<Person> people;

	public People()
	{
		people = new Vector<Person>();
	}

	public void addPerson(Person person)
	{
		people.add(person);
	}
	
	public Person getPerson(int id)
	{
		for(Person p : people)
			if(p.getGameID() == id)
				return p;
		return null;
	}

	public Vector<Person> getPeople()
	{
		return people;
	}

	public int size()
	{
		return people.size();
	}

}
