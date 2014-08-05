package character;

import other.Village;


public class Person
{
	private PersonalData pData;
	private PersonalGameData pGameData;

	public Person(PersonalData pData)
	{
		this.pData = pData;
	}

	public String toString()
	{
		return pData.toString();
	}
	
	public void setPersonalGameData(PersonalGameData pGameData)
	{
		this.pGameData = pGameData;
	}
	
	public PersonalGameData getPersonalGameData()
	{
		return pGameData;
	}
	
	public boolean execute(Village village)
	{
		return pGameData.execute(village);
	}

}
