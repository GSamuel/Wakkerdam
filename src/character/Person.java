package character;

import card.Card;
import other.Village;


public class Person
{
	private PersonalData pData;
	private PersonalGameData pGameData;

	public Person(PersonalData pData)
	{
		this.pData = pData;
	}
	
	public void isAlive(boolean alive)
	{
		pGameData.isAlive(alive);
	}
	
	public boolean isAlive()
	{
		return pGameData.isAlive();
	}

	public String toString()
	{
		return pData.toString();
	}
	
	public String getName()
	{
		return pData.getName();
	}
	
	public Gender getGender()
	{
		return pData.getGender();
	}
		
	public Age getAge()
	{
		return pData.getAge();
	}
	
	public int getGameID()
	{
		return pGameData.getGameID();
	}
	
	public Card getCard()
	{
		return pGameData.getCard();
	}
	
	public PersonalGameData getPersonalGameData()
	{
		return pGameData;
	}
	
	public void setPersonalGameData(PersonalGameData pGameData)
	{
		this.pGameData = pGameData;
	}
	
	public boolean execute(Village village)
	{
		return pGameData.execute(village);
	}

}
