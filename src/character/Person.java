package character;

public class Person
{
	private PersonalData personalData;
	private PersonalGameData personalGameData;

	public Person(PersonalData personalData)
	{
		this.personalData = personalData;
		this.personalGameData = new PersonalGameData();
	}

	public String toString()
	{
		return personalData.toString();
	}
	
	public PersonalGameData getPersonalGameData()
	{
		return personalGameData;
	}

}
