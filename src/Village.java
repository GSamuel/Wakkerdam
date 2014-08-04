import java.util.Vector;

import character.Person;


public class Village
{
	private int size;
	private Vector<Person> village;
	
	public Village(int size)
	{
		this.size = size;
		village = new Vector<Person>();
	}
	
	public void addPerson(Person person)
	{
		village.add(person);
	}
	
	public int getSize()
	{
		return size;
	}
}
